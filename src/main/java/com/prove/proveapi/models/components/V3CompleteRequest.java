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

public class V3CompleteRequest {

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    @JsonProperty("individual")
    private V3CompleteIndividualRequest individual;

    @JsonCreator
    public V3CompleteRequest(
            @JsonProperty("correlationId") String correlationId,
            @JsonProperty("individual") V3CompleteIndividualRequest individual) {
        Utils.checkNotNull(correlationId, "correlationId");
        Utils.checkNotNull(individual, "individual");
        this.correlationId = correlationId;
        this.individual = individual;
    }

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    @JsonIgnore
    public V3CompleteIndividualRequest individual() {
        return individual;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    public V3CompleteRequest withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    public V3CompleteRequest withIndividual(V3CompleteIndividualRequest individual) {
        Utils.checkNotNull(individual, "individual");
        this.individual = individual;
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
        V3CompleteRequest other = (V3CompleteRequest) o;
        return 
            Objects.deepEquals(this.correlationId, other.correlationId) &&
            Objects.deepEquals(this.individual, other.individual);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            correlationId,
            individual);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3CompleteRequest.class,
                "correlationId", correlationId,
                "individual", individual);
    }
    
    public final static class Builder {
 
        private String correlationId;
 
        private V3CompleteIndividualRequest individual;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }

        public Builder individual(V3CompleteIndividualRequest individual) {
            Utils.checkNotNull(individual, "individual");
            this.individual = individual;
            return this;
        }
        
        public V3CompleteRequest build() {
            return new V3CompleteRequest(
                correlationId,
                individual);
        }
    }
}

