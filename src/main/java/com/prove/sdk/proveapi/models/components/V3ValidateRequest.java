/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.sdk.proveapi.utils.LazySingletonValue;
import com.prove.sdk.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V3ValidateRequest {

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("correlationId")
    private Optional<? extends String> correlationId;

    @JsonCreator
    public V3ValidateRequest(
            @JsonProperty("correlationId") Optional<? extends String> correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
    }
    
    public V3ValidateRequest() {
        this(Optional.empty());
    }

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> correlationId() {
        return (Optional<String>) correlationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    public V3ValidateRequest withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = Optional.ofNullable(correlationId);
        return this;
    }

    /**
     * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
     */
    public V3ValidateRequest withCorrelationId(Optional<? extends String> correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
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
        V3ValidateRequest other = (V3ValidateRequest) o;
        return 
            java.util.Objects.deepEquals(this.correlationId, other.correlationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            correlationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ValidateRequest.class,
                "correlationId", correlationId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> correlationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = Optional.ofNullable(correlationId);
            return this;
        }

        /**
         * Correlation ID is the unique ID of the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow.
         */
        public Builder correlationId(Optional<? extends String> correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }
        
        public V3ValidateRequest build() {
            if (correlationId == null) {
                correlationId = _SINGLETON_VALUE_CorrelationId.value();
            }
            return new V3ValidateRequest(
                correlationId);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_CorrelationId =
                new LazySingletonValue<>(
                        "correlationId",
                        "\"713189b8-5555-4b08-83ba-75d08780aebd\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}
