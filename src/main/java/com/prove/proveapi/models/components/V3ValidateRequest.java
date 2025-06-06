/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.prove.proveapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class V3ValidateRequest {

    /**
     * The unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    @JsonCreator
    public V3ValidateRequest(
            @JsonProperty("correlationId") String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
    }

    /**
     * The unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    public V3ValidateRequest withCorrelationId(String correlationId) {
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
            Objects.deepEquals(this.correlationId, other.correlationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            correlationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ValidateRequest.class,
                "correlationId", correlationId);
    }
    
    public final static class Builder {
 
        private String correlationId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }
        
        public V3ValidateRequest build() {
            return new V3ValidateRequest(
                correlationId);
        }
    }
}
