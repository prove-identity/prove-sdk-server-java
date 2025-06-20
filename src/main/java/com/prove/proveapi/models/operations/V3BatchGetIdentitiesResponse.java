/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class V3BatchGetIdentitiesResponse implements Response {

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
     * V3BatchGetIdentitiesResponse
     */
    private Optional<? extends com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse;

    @JsonCreator
    public V3BatchGetIdentitiesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3BatchGetIdentitiesResponse, "v3BatchGetIdentitiesResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3BatchGetIdentitiesResponse = v3BatchGetIdentitiesResponse;
    }
    
    public V3BatchGetIdentitiesResponse(
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
     * V3BatchGetIdentitiesResponse
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse() {
        return (Optional<com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse>) v3BatchGetIdentitiesResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V3BatchGetIdentitiesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3BatchGetIdentitiesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3BatchGetIdentitiesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * V3BatchGetIdentitiesResponse
     */
    public V3BatchGetIdentitiesResponse withV3BatchGetIdentitiesResponse(com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse v3BatchGetIdentitiesResponse) {
        Utils.checkNotNull(v3BatchGetIdentitiesResponse, "v3BatchGetIdentitiesResponse");
        this.v3BatchGetIdentitiesResponse = Optional.ofNullable(v3BatchGetIdentitiesResponse);
        return this;
    }

    /**
     * V3BatchGetIdentitiesResponse
     */
    public V3BatchGetIdentitiesResponse withV3BatchGetIdentitiesResponse(Optional<? extends com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse) {
        Utils.checkNotNull(v3BatchGetIdentitiesResponse, "v3BatchGetIdentitiesResponse");
        this.v3BatchGetIdentitiesResponse = v3BatchGetIdentitiesResponse;
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
        V3BatchGetIdentitiesResponse other = (V3BatchGetIdentitiesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3BatchGetIdentitiesResponse, other.v3BatchGetIdentitiesResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3BatchGetIdentitiesResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3BatchGetIdentitiesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3BatchGetIdentitiesResponse", v3BatchGetIdentitiesResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse = Optional.empty();
        
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
         * V3BatchGetIdentitiesResponse
         */
        public Builder v3BatchGetIdentitiesResponse(com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse v3BatchGetIdentitiesResponse) {
            Utils.checkNotNull(v3BatchGetIdentitiesResponse, "v3BatchGetIdentitiesResponse");
            this.v3BatchGetIdentitiesResponse = Optional.ofNullable(v3BatchGetIdentitiesResponse);
            return this;
        }

        /**
         * V3BatchGetIdentitiesResponse
         */
        public Builder v3BatchGetIdentitiesResponse(Optional<? extends com.prove.proveapi.models.components.V3BatchGetIdentitiesResponse> v3BatchGetIdentitiesResponse) {
            Utils.checkNotNull(v3BatchGetIdentitiesResponse, "v3BatchGetIdentitiesResponse");
            this.v3BatchGetIdentitiesResponse = v3BatchGetIdentitiesResponse;
            return this;
        }
        
        public V3BatchGetIdentitiesResponse build() {
            return new V3BatchGetIdentitiesResponse(
                contentType,
                statusCode,
                rawResponse,
                v3BatchGetIdentitiesResponse);
        }
    }
}
