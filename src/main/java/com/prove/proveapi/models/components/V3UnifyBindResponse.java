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

public class V3UnifyBindResponse {

    /**
     * The number of the mobile phone used during the process.
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * The result of the possession check.
     * Possible values are `true`, `false`, `pending`, and `possession_required`.
     */
    @JsonProperty("success")
    private String success;

    @JsonCreator
    public V3UnifyBindResponse(
            @JsonProperty("phoneNumber") String phoneNumber,
            @JsonProperty("success") String success) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(success, "success");
        this.phoneNumber = phoneNumber;
        this.success = success;
    }

    /**
     * The number of the mobile phone used during the process.
     */
    @JsonIgnore
    public String phoneNumber() {
        return phoneNumber;
    }

    /**
     * The result of the possession check.
     * Possible values are `true`, `false`, `pending`, and `possession_required`.
     */
    @JsonIgnore
    public String success() {
        return success;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The number of the mobile phone used during the process.
     */
    public V3UnifyBindResponse withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The result of the possession check.
     * Possible values are `true`, `false`, `pending`, and `possession_required`.
     */
    public V3UnifyBindResponse withSuccess(String success) {
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
        V3UnifyBindResponse other = (V3UnifyBindResponse) o;
        return 
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.success, other.success);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            phoneNumber,
            success);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3UnifyBindResponse.class,
                "phoneNumber", phoneNumber,
                "success", success);
    }
    
    public final static class Builder {
 
        private String phoneNumber;
 
        private String success;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The number of the mobile phone used during the process.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The result of the possession check.
         * Possible values are `true`, `false`, `pending`, and `possession_required`.
         */
        public Builder success(String success) {
            Utils.checkNotNull(success, "success");
            this.success = success;
            return this;
        }
        
        public V3UnifyBindResponse build() {
            return new V3UnifyBindResponse(
                phoneNumber,
                success);
        }
    }
}
