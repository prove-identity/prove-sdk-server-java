/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HTTPRequest {

    private static final String FRAGMENT_SEGMENT_START = "#";
    private static final String QUERY_NAME_VALUE_DELIMITER = "=";
    private static final String QUERY_PARAMETER_DELIMITER = "&";
    private static final String QUERY_SEGMENT_START = "?";
    private final String baseURL;
    private final String method;
    private final List<QueryParameter> queryParams = new ArrayList<>();
    private final Map<String, List<String>> headers = new HashMap<>();
    private Optional<SerializedBody> body = Optional.empty(); // mutable

    public HTTPRequest(String baseURL, String method) {
        Utils.checkNotNull(baseURL, "baseURL");
        Utils.checkNotNull(method, "method");
        this.baseURL = baseURL;
        this.method = method;
    }
    
    public void setBody(Optional<SerializedBody> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
    }
    
    public HTTPRequest addHeader(String key, String value) {
        List<String> headerValues = headers.get(key);
        if (headerValues == null) {
            headerValues = new ArrayList<>();
            headers.put(key, headerValues);
        }
        if (!headerValues.contains(value)) {
            headerValues.add(value);
        }
        return this;
    }
    
    public HTTPRequest addHeaders(Map<String, List<String>> map) {
        map.forEach((key, list) -> list.forEach(v -> addHeader(key, v)));
        return this;
    }
    
    public HTTPRequest addQueryParam(QueryParameter param) {
        this.queryParams.add(param);
        return this;
    }
    
    public HTTPRequest addQueryParam(String key, String value, boolean allowReserved) {
        this.queryParams.add(QueryParameter.of(key, value, allowReserved));
        return this;
    }
    
    public HTTPRequest addQueryParams(Collection<QueryParameter> params) {
        params.forEach(p -> addQueryParam(p));
        return this;
    }
    
    public HttpRequest build() {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();

        final BodyPublisher bodyPublisher;
        if (body.isPresent()) {
            bodyPublisher = body.get().body();
            requestBuilder.header("Content-Type", body.get().contentType());
        } else {
            bodyPublisher = BodyPublishers.noBody();
        }
        requestBuilder.method(method, bodyPublisher);
        try {
            requestBuilder.uri(new URI(buildUrl(baseURL, queryParams)));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        headers.forEach((k, list) -> list.forEach(v -> requestBuilder.header(k, v)));
        return requestBuilder.build();
    }
    
    // VisibleForTesting
    public static String buildUrl(String baseURL, Collection<QueryParameter> queryParams) {
        if (queryParams.isEmpty()) {
            return baseURL;
        } else {
            final String base;
            final String fragment;
            int i = baseURL.indexOf(FRAGMENT_SEGMENT_START);
            if (i == -1) {
                base = baseURL;
                fragment = "";
            } else {
                base = baseURL.substring(0, i);
                fragment = baseURL.substring(i);
            }
            StringBuilder b = new StringBuilder(base);
            if (!base.contains(QUERY_SEGMENT_START)) {
                b.append(QUERY_SEGMENT_START);
            } else {
                b.append(QUERY_PARAMETER_DELIMITER);
            }
            boolean first = true;
            for (QueryParameter p : queryParams) {
                 if (!first) {
                     b.append(QUERY_PARAMETER_DELIMITER);
                 }
                 first = false;
                 // don't allow reserved characters to be unencoded in key (??)
                 b.append(Utf8UrlEncoder.DEFAULT.encode(p.name()));
                 b.append(QUERY_NAME_VALUE_DELIMITER);
                 b.append(Utf8UrlEncoder.allowReserved(p.allowReserved()).encode(p.value()));
            }
            b.append(fragment);
            return b.toString();
        }
    }
    
}