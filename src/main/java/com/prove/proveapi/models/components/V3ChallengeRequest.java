/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.prove.proveapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class V3ChallengeRequest {

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<String> dob;

    /**
     * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<String> ssn;

    @JsonCreator
    public V3ChallengeRequest(
            @JsonProperty("correlationId") String correlationId,
            @JsonProperty("dob") Optional<String> dob,
            @JsonProperty("ssn") Optional<String> ssn) {
        Utils.checkNotNull(correlationId, "correlationId");
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(ssn, "ssn");
        this.correlationId = correlationId;
        this.dob = dob;
        this.ssn = ssn;
    }
    
    public V3ChallengeRequest(
            String correlationId) {
        this(correlationId, Optional.empty(), Optional.empty());
    }

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonIgnore
    public Optional<String> dob() {
        return dob;
    }

    /**
     * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    @JsonIgnore
    public Optional<String> ssn() {
        return ssn;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. It is returned from the Start endpoint and cannot be reused outside of a single flow.
     */
    public V3ChallengeRequest withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3ChallengeRequest withDob(String dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3ChallengeRequest withDob(Optional<String> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    /**
     * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    public V3ChallengeRequest withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    /**
     * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
     */
    public V3ChallengeRequest withSsn(Optional<String> ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
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
        V3ChallengeRequest other = (V3ChallengeRequest) o;
        return 
            Objects.deepEquals(this.correlationId, other.correlationId) &&
            Objects.deepEquals(this.dob, other.dob) &&
            Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            correlationId,
            dob,
            ssn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeRequest.class,
                "correlationId", correlationId,
                "dob", dob,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private String correlationId;
 
        private Optional<String> dob = Optional.empty();
 
        private Optional<String> ssn = Optional.empty();
        
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

        /**
         * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(String dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        /**
         * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(Optional<String> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        /**
         * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
         */
        public Builder ssn(String ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        /**
         * SSN is either the full or last 4 numbers of the social security number. Acceptable characters are: numeric.
         */
        public Builder ssn(Optional<String> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }
        
        public V3ChallengeRequest build() {
            return new V3ChallengeRequest(
                correlationId,
                dob,
                ssn);
        }
    }
}
