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

public class V3VerifyResponse {

    /**
     * AuthToken is a bearer token for use by the Prove Client SDK.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authToken")
    private Optional<String> authToken;

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    /**
     * Possession Result represents the result of the Possession check. Possible values are "pending" and "not_applicable", based on the Possession Type passed in the input. Clients will have to call the Verify Status API to get a result if Possession Result is pending.
     */
    @JsonProperty("possessionResult")
    private PossessionResult possessionResult;

    /**
     * Success is the result of the combination of Verify Result and Possession Result. Possible values are "true", "pending", and "false". The success value will be "pending" until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    @JsonProperty("success")
    private Success success;

    /**
     * Verify Result represents the result of the Verify process. Possible values are "success", "pending", and "failed". If the Verify result is pending, clients will need to call the Verify Status API to get a result.
     */
    @JsonProperty("verifyResult")
    private VerifyResult verifyResult;

    @JsonCreator
    public V3VerifyResponse(
            @JsonProperty("authToken") Optional<String> authToken,
            @JsonProperty("correlationId") String correlationId,
            @JsonProperty("possessionResult") PossessionResult possessionResult,
            @JsonProperty("success") Success success,
            @JsonProperty("verifyResult") VerifyResult verifyResult) {
        Utils.checkNotNull(authToken, "authToken");
        Utils.checkNotNull(correlationId, "correlationId");
        Utils.checkNotNull(possessionResult, "possessionResult");
        Utils.checkNotNull(success, "success");
        Utils.checkNotNull(verifyResult, "verifyResult");
        this.authToken = authToken;
        this.correlationId = correlationId;
        this.possessionResult = possessionResult;
        this.success = success;
        this.verifyResult = verifyResult;
    }
    
    public V3VerifyResponse(
            String correlationId,
            PossessionResult possessionResult,
            Success success,
            VerifyResult verifyResult) {
        this(Optional.empty(), correlationId, possessionResult, success, verifyResult);
    }

    /**
     * AuthToken is a bearer token for use by the Prove Client SDK.
     */
    @JsonIgnore
    public Optional<String> authToken() {
        return authToken;
    }

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    /**
     * Possession Result represents the result of the Possession check. Possible values are "pending" and "not_applicable", based on the Possession Type passed in the input. Clients will have to call the Verify Status API to get a result if Possession Result is pending.
     */
    @JsonIgnore
    public PossessionResult possessionResult() {
        return possessionResult;
    }

    /**
     * Success is the result of the combination of Verify Result and Possession Result. Possible values are "true", "pending", and "false". The success value will be "pending" until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    @JsonIgnore
    public Success success() {
        return success;
    }

    /**
     * Verify Result represents the result of the Verify process. Possible values are "success", "pending", and "failed". If the Verify result is pending, clients will need to call the Verify Status API to get a result.
     */
    @JsonIgnore
    public VerifyResult verifyResult() {
        return verifyResult;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * AuthToken is a bearer token for use by the Prove Client SDK.
     */
    public V3VerifyResponse withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = Optional.ofNullable(authToken);
        return this;
    }

    /**
     * AuthToken is a bearer token for use by the Prove Client SDK.
     */
    public V3VerifyResponse withAuthToken(Optional<String> authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        return this;
    }

    /**
     * Correlation ID is the unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    public V3VerifyResponse withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Possession Result represents the result of the Possession check. Possible values are "pending" and "not_applicable", based on the Possession Type passed in the input. Clients will have to call the Verify Status API to get a result if Possession Result is pending.
     */
    public V3VerifyResponse withPossessionResult(PossessionResult possessionResult) {
        Utils.checkNotNull(possessionResult, "possessionResult");
        this.possessionResult = possessionResult;
        return this;
    }

    /**
     * Success is the result of the combination of Verify Result and Possession Result. Possible values are "true", "pending", and "false". The success value will be "pending" until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    public V3VerifyResponse withSuccess(Success success) {
        Utils.checkNotNull(success, "success");
        this.success = success;
        return this;
    }

    /**
     * Verify Result represents the result of the Verify process. Possible values are "success", "pending", and "failed". If the Verify result is pending, clients will need to call the Verify Status API to get a result.
     */
    public V3VerifyResponse withVerifyResult(VerifyResult verifyResult) {
        Utils.checkNotNull(verifyResult, "verifyResult");
        this.verifyResult = verifyResult;
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
        V3VerifyResponse other = (V3VerifyResponse) o;
        return 
            Objects.deepEquals(this.authToken, other.authToken) &&
            Objects.deepEquals(this.correlationId, other.correlationId) &&
            Objects.deepEquals(this.possessionResult, other.possessionResult) &&
            Objects.deepEquals(this.success, other.success) &&
            Objects.deepEquals(this.verifyResult, other.verifyResult);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authToken,
            correlationId,
            possessionResult,
            success,
            verifyResult);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3VerifyResponse.class,
                "authToken", authToken,
                "correlationId", correlationId,
                "possessionResult", possessionResult,
                "success", success,
                "verifyResult", verifyResult);
    }
    
    public final static class Builder {
 
        private Optional<String> authToken = Optional.empty();
 
        private String correlationId;
 
        private PossessionResult possessionResult;
 
        private Success success;
 
        private VerifyResult verifyResult;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AuthToken is a bearer token for use by the Prove Client SDK.
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = Optional.ofNullable(authToken);
            return this;
        }

        /**
         * AuthToken is a bearer token for use by the Prove Client SDK.
         */
        public Builder authToken(Optional<String> authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }

        /**
         * Correlation ID is the unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }

        /**
         * Possession Result represents the result of the Possession check. Possible values are "pending" and "not_applicable", based on the Possession Type passed in the input. Clients will have to call the Verify Status API to get a result if Possession Result is pending.
         */
        public Builder possessionResult(PossessionResult possessionResult) {
            Utils.checkNotNull(possessionResult, "possessionResult");
            this.possessionResult = possessionResult;
            return this;
        }

        /**
         * Success is the result of the combination of Verify Result and Possession Result. Possible values are "true", "pending", and "false". The success value will be "pending" until the results of both Verify and Possession are returned or one of them fails, blocking the other.
         */
        public Builder success(Success success) {
            Utils.checkNotNull(success, "success");
            this.success = success;
            return this;
        }

        /**
         * Verify Result represents the result of the Verify process. Possible values are "success", "pending", and "failed". If the Verify result is pending, clients will need to call the Verify Status API to get a result.
         */
        public Builder verifyResult(VerifyResult verifyResult) {
            Utils.checkNotNull(verifyResult, "verifyResult");
            this.verifyResult = verifyResult;
            return this;
        }
        
        public V3VerifyResponse build() {
            return new V3VerifyResponse(
                authToken,
                correlationId,
                possessionResult,
                success,
                verifyResult);
        }
    }
}
