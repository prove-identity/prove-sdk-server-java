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
     * A bearer token for use by the Prove client SDK.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authToken")
    private Optional<String> authToken;

    /**
     * The unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    @JsonProperty("correlationId")
    private String correlationId;

    /**
     * The result of the possession check. Possible values are `pending` and `not_applicable`, based on the `possessionType` passed in the input. Clients will have to call the Verify Status API to get a result if `possessionResult=pending`.
     */
    @JsonProperty("possessionResult")
    private String possessionResult;

    /**
     * The result of the combination of `verifyResult` and `possessionResult`. Possible values are `true`, `pending`, and `false`. The value will be `pending` until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    @JsonProperty("success")
    private String success;

    /**
     * The result of the Verify process. Possible values are `success`, `pending`, and `failed`. If the Verify result is `pending`, clients will need to call the Verify Status API to get a result.
     */
    @JsonProperty("verifyResult")
    private String verifyResult;

    @JsonCreator
    public V3VerifyResponse(
            @JsonProperty("authToken") Optional<String> authToken,
            @JsonProperty("correlationId") String correlationId,
            @JsonProperty("possessionResult") String possessionResult,
            @JsonProperty("success") String success,
            @JsonProperty("verifyResult") String verifyResult) {
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
            String possessionResult,
            String success,
            String verifyResult) {
        this(Optional.empty(), correlationId, possessionResult, success, verifyResult);
    }

    /**
     * A bearer token for use by the Prove client SDK.
     */
    @JsonIgnore
    public Optional<String> authToken() {
        return authToken;
    }

    /**
     * The unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    @JsonIgnore
    public String correlationId() {
        return correlationId;
    }

    /**
     * The result of the possession check. Possible values are `pending` and `not_applicable`, based on the `possessionType` passed in the input. Clients will have to call the Verify Status API to get a result if `possessionResult=pending`.
     */
    @JsonIgnore
    public String possessionResult() {
        return possessionResult;
    }

    /**
     * The result of the combination of `verifyResult` and `possessionResult`. Possible values are `true`, `pending`, and `false`. The value will be `pending` until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    @JsonIgnore
    public String success() {
        return success;
    }

    /**
     * The result of the Verify process. Possible values are `success`, `pending`, and `failed`. If the Verify result is `pending`, clients will need to call the Verify Status API to get a result.
     */
    @JsonIgnore
    public String verifyResult() {
        return verifyResult;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A bearer token for use by the Prove client SDK.
     */
    public V3VerifyResponse withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = Optional.ofNullable(authToken);
        return this;
    }

    /**
     * A bearer token for use by the Prove client SDK.
     */
    public V3VerifyResponse withAuthToken(Optional<String> authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        return this;
    }

    /**
     * The unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
     */
    public V3VerifyResponse withCorrelationId(String correlationId) {
        Utils.checkNotNull(correlationId, "correlationId");
        this.correlationId = correlationId;
        return this;
    }

    /**
     * The result of the possession check. Possible values are `pending` and `not_applicable`, based on the `possessionType` passed in the input. Clients will have to call the Verify Status API to get a result if `possessionResult=pending`.
     */
    public V3VerifyResponse withPossessionResult(String possessionResult) {
        Utils.checkNotNull(possessionResult, "possessionResult");
        this.possessionResult = possessionResult;
        return this;
    }

    /**
     * The result of the combination of `verifyResult` and `possessionResult`. Possible values are `true`, `pending`, and `false`. The value will be `pending` until the results of both Verify and Possession are returned or one of them fails, blocking the other.
     */
    public V3VerifyResponse withSuccess(String success) {
        Utils.checkNotNull(success, "success");
        this.success = success;
        return this;
    }

    /**
     * The result of the Verify process. Possible values are `success`, `pending`, and `failed`. If the Verify result is `pending`, clients will need to call the Verify Status API to get a result.
     */
    public V3VerifyResponse withVerifyResult(String verifyResult) {
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
 
        private String possessionResult;
 
        private String success;
 
        private String verifyResult;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A bearer token for use by the Prove client SDK.
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = Optional.ofNullable(authToken);
            return this;
        }

        /**
         * A bearer token for use by the Prove client SDK.
         */
        public Builder authToken(Optional<String> authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }

        /**
         * The unique ID that Prove generates for the flow. To continue the flow, the field will also be used for each of the subsequent API calls in the same flow - it cannot be reused outside of a single flow.
         */
        public Builder correlationId(String correlationId) {
            Utils.checkNotNull(correlationId, "correlationId");
            this.correlationId = correlationId;
            return this;
        }

        /**
         * The result of the possession check. Possible values are `pending` and `not_applicable`, based on the `possessionType` passed in the input. Clients will have to call the Verify Status API to get a result if `possessionResult=pending`.
         */
        public Builder possessionResult(String possessionResult) {
            Utils.checkNotNull(possessionResult, "possessionResult");
            this.possessionResult = possessionResult;
            return this;
        }

        /**
         * The result of the combination of `verifyResult` and `possessionResult`. Possible values are `true`, `pending`, and `false`. The value will be `pending` until the results of both Verify and Possession are returned or one of them fails, blocking the other.
         */
        public Builder success(String success) {
            Utils.checkNotNull(success, "success");
            this.success = success;
            return this;
        }

        /**
         * The result of the Verify process. Possible values are `success`, `pending`, and `failed`. If the Verify result is `pending`, clients will need to call the Verify Status API to get a result.
         */
        public Builder verifyResult(String verifyResult) {
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
