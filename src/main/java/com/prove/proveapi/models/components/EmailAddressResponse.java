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

public class EmailAddressResponse {

    /**
     * A boolean value indicating if the email address was matched during processing.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private Optional<? extends Boolean> emailAddress;

    @JsonCreator
    public EmailAddressResponse(
            @JsonProperty("emailAddress") Optional<? extends Boolean> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
    }
    
    public EmailAddressResponse() {
        this(Optional.empty());
    }

    /**
     * A boolean value indicating if the email address was matched during processing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> emailAddress() {
        return (Optional<Boolean>) emailAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A boolean value indicating if the email address was matched during processing.
     */
    public EmailAddressResponse withEmailAddress(boolean emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = Optional.ofNullable(emailAddress);
        return this;
    }

    /**
     * A boolean value indicating if the email address was matched during processing.
     */
    public EmailAddressResponse withEmailAddress(Optional<? extends Boolean> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
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
        EmailAddressResponse other = (EmailAddressResponse) o;
        return 
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            emailAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmailAddressResponse.class,
                "emailAddress", emailAddress);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> emailAddress = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A boolean value indicating if the email address was matched during processing.
         */
        public Builder emailAddress(boolean emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = Optional.ofNullable(emailAddress);
            return this;
        }

        /**
         * A boolean value indicating if the email address was matched during processing.
         */
        public Builder emailAddress(Optional<? extends Boolean> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }
        
        public EmailAddressResponse build() {
            return new EmailAddressResponse(
                emailAddress);
        }
    }
}
