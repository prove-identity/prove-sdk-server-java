/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prove.proveapi.models.components.V3CompleteResponse;
import com.prove.proveapi.utils.Response;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class V3CompleteRequestResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Successful request.
     */
    private Optional<? extends V3CompleteResponse> v3CompleteResponse;

    @JsonCreator
    public V3CompleteRequestResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V3CompleteResponse> v3CompleteResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3CompleteResponse, "v3CompleteResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3CompleteResponse = v3CompleteResponse;
    }
    
    public V3CompleteRequestResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Successful request.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V3CompleteResponse> v3CompleteResponse() {
        return (Optional<V3CompleteResponse>) v3CompleteResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V3CompleteRequestResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3CompleteRequestResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3CompleteRequestResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Successful request.
     */
    public V3CompleteRequestResponse withV3CompleteResponse(V3CompleteResponse v3CompleteResponse) {
        Utils.checkNotNull(v3CompleteResponse, "v3CompleteResponse");
        this.v3CompleteResponse = Optional.ofNullable(v3CompleteResponse);
        return this;
    }

    /**
     * Successful request.
     */
    public V3CompleteRequestResponse withV3CompleteResponse(Optional<? extends V3CompleteResponse> v3CompleteResponse) {
        Utils.checkNotNull(v3CompleteResponse, "v3CompleteResponse");
        this.v3CompleteResponse = v3CompleteResponse;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V3CompleteRequestResponse other = (V3CompleteRequestResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3CompleteResponse, other.v3CompleteResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3CompleteResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3CompleteRequestResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3CompleteResponse", v3CompleteResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V3CompleteResponse> v3CompleteResponse = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Successful request.
         */
        public Builder v3CompleteResponse(V3CompleteResponse v3CompleteResponse) {
            Utils.checkNotNull(v3CompleteResponse, "v3CompleteResponse");
            this.v3CompleteResponse = Optional.ofNullable(v3CompleteResponse);
            return this;
        }

        /**
         * Successful request.
         */
        public Builder v3CompleteResponse(Optional<? extends V3CompleteResponse> v3CompleteResponse) {
            Utils.checkNotNull(v3CompleteResponse, "v3CompleteResponse");
            this.v3CompleteResponse = v3CompleteResponse;
            return this;
        }
        
        public V3CompleteRequestResponse build() {
            return new V3CompleteRequestResponse(
                contentType,
                statusCode,
                rawResponse,
                v3CompleteResponse);
        }
    }
}
