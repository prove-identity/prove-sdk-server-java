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
import com.prove.sdk.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V3ChallengeIndividualRequest {

    /**
     * Addresses that belong to the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private Optional<? extends java.util.List<V3ChallengeAddressEntryRequest>> addresses;

    /**
     * DOB is the date of birth of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<? extends String> dob;

    /**
     * Email addresses that belong to the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddresses")
    private Optional<? extends java.util.List<String>> emailAddresses;

    /**
     * First name of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstName")
    private Optional<? extends String> firstName;

    /**
     * Last name of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    private Optional<? extends String> lastName;

    /**
     * SSN is the social security number of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<? extends String> ssn;

    @JsonCreator
    public V3ChallengeIndividualRequest(
            @JsonProperty("addresses") Optional<? extends java.util.List<V3ChallengeAddressEntryRequest>> addresses,
            @JsonProperty("dob") Optional<? extends String> dob,
            @JsonProperty("emailAddresses") Optional<? extends java.util.List<String>> emailAddresses,
            @JsonProperty("firstName") Optional<? extends String> firstName,
            @JsonProperty("lastName") Optional<? extends String> lastName,
            @JsonProperty("ssn") Optional<? extends String> ssn) {
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(emailAddresses, "emailAddresses");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(ssn, "ssn");
        this.addresses = addresses;
        this.dob = dob;
        this.emailAddresses = emailAddresses;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    public V3ChallengeIndividualRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Addresses that belong to the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<V3ChallengeAddressEntryRequest>> addresses() {
        return (Optional<java.util.List<V3ChallengeAddressEntryRequest>>) addresses;
    }

    /**
     * DOB is the date of birth of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> dob() {
        return (Optional<String>) dob;
    }

    /**
     * Email addresses that belong to the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> emailAddresses() {
        return (Optional<java.util.List<String>>) emailAddresses;
    }

    /**
     * First name of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> firstName() {
        return (Optional<String>) firstName;
    }

    /**
     * Last name of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastName() {
        return (Optional<String>) lastName;
    }

    /**
     * SSN is the social security number of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> ssn() {
        return (Optional<String>) ssn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Addresses that belong to the individual.
     */
    public V3ChallengeIndividualRequest withAddresses(java.util.List<V3ChallengeAddressEntryRequest> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = Optional.ofNullable(addresses);
        return this;
    }

    /**
     * Addresses that belong to the individual.
     */
    public V3ChallengeIndividualRequest withAddresses(Optional<? extends java.util.List<V3ChallengeAddressEntryRequest>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    /**
     * DOB is the date of birth of the individual.
     */
    public V3ChallengeIndividualRequest withDob(String dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    /**
     * DOB is the date of birth of the individual.
     */
    public V3ChallengeIndividualRequest withDob(Optional<? extends String> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    /**
     * Email addresses that belong to the individual.
     */
    public V3ChallengeIndividualRequest withEmailAddresses(java.util.List<String> emailAddresses) {
        Utils.checkNotNull(emailAddresses, "emailAddresses");
        this.emailAddresses = Optional.ofNullable(emailAddresses);
        return this;
    }

    /**
     * Email addresses that belong to the individual.
     */
    public V3ChallengeIndividualRequest withEmailAddresses(Optional<? extends java.util.List<String>> emailAddresses) {
        Utils.checkNotNull(emailAddresses, "emailAddresses");
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * First name of the individual.
     */
    public V3ChallengeIndividualRequest withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    /**
     * First name of the individual.
     */
    public V3ChallengeIndividualRequest withFirstName(Optional<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the individual.
     */
    public V3ChallengeIndividualRequest withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    /**
     * Last name of the individual.
     */
    public V3ChallengeIndividualRequest withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * SSN is the social security number of the individual.
     */
    public V3ChallengeIndividualRequest withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    /**
     * SSN is the social security number of the individual.
     */
    public V3ChallengeIndividualRequest withSsn(Optional<? extends String> ssn) {
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
        V3ChallengeIndividualRequest other = (V3ChallengeIndividualRequest) o;
        return 
            java.util.Objects.deepEquals(this.addresses, other.addresses) &&
            java.util.Objects.deepEquals(this.dob, other.dob) &&
            java.util.Objects.deepEquals(this.emailAddresses, other.emailAddresses) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            addresses,
            dob,
            emailAddresses,
            firstName,
            lastName,
            ssn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeIndividualRequest.class,
                "addresses", addresses,
                "dob", dob,
                "emailAddresses", emailAddresses,
                "firstName", firstName,
                "lastName", lastName,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<V3ChallengeAddressEntryRequest>> addresses = Optional.empty();
 
        private Optional<? extends String> dob = Optional.empty();
 
        private Optional<? extends java.util.List<String>> emailAddresses = Optional.empty();
 
        private Optional<? extends String> firstName = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();
 
        private Optional<? extends String> ssn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Addresses that belong to the individual.
         */
        public Builder addresses(java.util.List<V3ChallengeAddressEntryRequest> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = Optional.ofNullable(addresses);
            return this;
        }

        /**
         * Addresses that belong to the individual.
         */
        public Builder addresses(Optional<? extends java.util.List<V3ChallengeAddressEntryRequest>> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = addresses;
            return this;
        }

        /**
         * DOB is the date of birth of the individual.
         */
        public Builder dob(String dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        /**
         * DOB is the date of birth of the individual.
         */
        public Builder dob(Optional<? extends String> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        /**
         * Email addresses that belong to the individual.
         */
        public Builder emailAddresses(java.util.List<String> emailAddresses) {
            Utils.checkNotNull(emailAddresses, "emailAddresses");
            this.emailAddresses = Optional.ofNullable(emailAddresses);
            return this;
        }

        /**
         * Email addresses that belong to the individual.
         */
        public Builder emailAddresses(Optional<? extends java.util.List<String>> emailAddresses) {
            Utils.checkNotNull(emailAddresses, "emailAddresses");
            this.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * First name of the individual.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * First name of the individual.
         */
        public Builder firstName(Optional<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the individual.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * Last name of the individual.
         */
        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * SSN is the social security number of the individual.
         */
        public Builder ssn(String ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        /**
         * SSN is the social security number of the individual.
         */
        public Builder ssn(Optional<? extends String> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }
        
        public V3ChallengeIndividualRequest build() {
            return new V3ChallengeIndividualRequest(
                addresses,
                dob,
                emailAddresses,
                firstName,
                lastName,
                ssn);
        }
    }
}
