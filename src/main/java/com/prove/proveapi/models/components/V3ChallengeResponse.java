/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V3ChallengeResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("individual")
    private Optional<? extends V3ChallengeIndividualRequest> individual;

    /**
     * Next contains the next set of allowed calls in the same flow.
     */
    @JsonProperty("next")
    private java.util.Map<String, String> next;

    /**
     * Success returns true if the challenge was accepted and user info retrieved.
     */
    @JsonProperty("success")
    private boolean success;

    @JsonCreator
    public V3ChallengeResponse(
            @JsonProperty("individual") Optional<? extends V3ChallengeIndividualRequest> individual,
            @JsonProperty("next") java.util.Map<String, String> next,
            @JsonProperty("success") boolean success) {
        Utils.checkNotNull(individual, "individual");
        next = Utils.emptyMapIfNull(next);
        Utils.checkNotNull(success, "success");
        this.individual = individual;
        this.next = next;
        this.success = success;
    }
    
    public V3ChallengeResponse(
            java.util.Map<String, String> next,
            boolean success) {
        this(Optional.empty(), next, success);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V3ChallengeIndividualRequest> individual() {
        return (Optional<V3ChallengeIndividualRequest>) individual;
    }

    /**
     * Next contains the next set of allowed calls in the same flow.
     */
    @JsonIgnore
    public java.util.Map<String, String> next() {
        return next;
    }

    /**
     * Success returns true if the challenge was accepted and user info retrieved.
     */
    @JsonIgnore
    public boolean success() {
        return success;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3ChallengeResponse withIndividual(V3ChallengeIndividualRequest individual) {
        Utils.checkNotNull(individual, "individual");
        this.individual = Optional.ofNullable(individual);
        return this;
    }

    public V3ChallengeResponse withIndividual(Optional<? extends V3ChallengeIndividualRequest> individual) {
        Utils.checkNotNull(individual, "individual");
        this.individual = individual;
        return this;
    }

    /**
     * Next contains the next set of allowed calls in the same flow.
     */
    public V3ChallengeResponse withNext(java.util.Map<String, String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    /**
     * Success returns true if the challenge was accepted and user info retrieved.
     */
    public V3ChallengeResponse withSuccess(boolean success) {
        Utils.checkNotNull(success, "success");
        this.success = success;
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
        V3ChallengeResponse other = (V3ChallengeResponse) o;
        return 
            java.util.Objects.deepEquals(this.individual, other.individual) &&
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.success, other.success);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            individual,
            next,
            success);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeResponse.class,
                "individual", individual,
                "next", next,
                "success", success);
    }
    
    public final static class Builder {
 
        private Optional<? extends V3ChallengeIndividualRequest> individual = Optional.empty();
 
        private java.util.Map<String, String> next;
 
        private Boolean success;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder individual(V3ChallengeIndividualRequest individual) {
            Utils.checkNotNull(individual, "individual");
            this.individual = Optional.ofNullable(individual);
            return this;
        }

        public Builder individual(Optional<? extends V3ChallengeIndividualRequest> individual) {
            Utils.checkNotNull(individual, "individual");
            this.individual = individual;
            return this;
        }

        /**
         * Next contains the next set of allowed calls in the same flow.
         */
        public Builder next(java.util.Map<String, String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        /**
         * Success returns true if the challenge was accepted and user info retrieved.
         */
        public Builder success(boolean success) {
            Utils.checkNotNull(success, "success");
            this.success = success;
            return this;
        }
        
        public V3ChallengeResponse build() {
            return new V3ChallengeResponse(
                individual,
                next,
                success);
        }
    }
}

