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

public class V3ChallengeAddressEntryRequest {

    /**
     * Address is the street address of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<String> address;

    /**
     * City of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extendedAddress")
    private Optional<String> extendedAddress;

    /**
     * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    /**
     * Region is the state or locality of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<String> region;

    @JsonCreator
    public V3ChallengeAddressEntryRequest(
            @JsonProperty("address") Optional<String> address,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("extendedAddress") Optional<String> extendedAddress,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("region") Optional<String> region) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(region, "region");
        this.address = address;
        this.city = city;
        this.extendedAddress = extendedAddress;
        this.postalCode = postalCode;
        this.region = region;
    }
    
    public V3ChallengeAddressEntryRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Address is the street address of the individual.
     */
    @JsonIgnore
    public Optional<String> address() {
        return address;
    }

    /**
     * City of the individual.
     */
    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @JsonIgnore
    public Optional<String> extendedAddress() {
        return extendedAddress;
    }

    /**
     * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
     */
    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    /**
     * Region is the state or locality of the individual.
     */
    @JsonIgnore
    public Optional<String> region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Address is the street address of the individual.
     */
    public V3ChallengeAddressEntryRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Address is the street address of the individual.
     */
    public V3ChallengeAddressEntryRequest withAddress(Optional<String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * City of the individual.
     */
    public V3ChallengeAddressEntryRequest withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    /**
     * City of the individual.
     */
    public V3ChallengeAddressEntryRequest withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public V3ChallengeAddressEntryRequest withExtendedAddress(String extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = Optional.ofNullable(extendedAddress);
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public V3ChallengeAddressEntryRequest withExtendedAddress(Optional<String> extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = extendedAddress;
        return this;
    }

    /**
     * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
     */
    public V3ChallengeAddressEntryRequest withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    /**
     * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
     */
    public V3ChallengeAddressEntryRequest withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public V3ChallengeAddressEntryRequest withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public V3ChallengeAddressEntryRequest withRegion(Optional<String> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        V3ChallengeAddressEntryRequest other = (V3ChallengeAddressEntryRequest) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.extendedAddress, other.extendedAddress) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            city,
            extendedAddress,
            postalCode,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ChallengeAddressEntryRequest.class,
                "address", address,
                "city", city,
                "extendedAddress", extendedAddress,
                "postalCode", postalCode,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<String> address = Optional.empty();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> extendedAddress = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> region = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Address is the street address of the individual.
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        /**
         * Address is the street address of the individual.
         */
        public Builder address(Optional<String> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * City of the individual.
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        /**
         * City of the individual.
         */
        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Extended address is the apartment number or other extended address information.
         */
        public Builder extendedAddress(String extendedAddress) {
            Utils.checkNotNull(extendedAddress, "extendedAddress");
            this.extendedAddress = Optional.ofNullable(extendedAddress);
            return this;
        }

        /**
         * Extended address is the apartment number or other extended address information.
         */
        public Builder extendedAddress(Optional<String> extendedAddress) {
            Utils.checkNotNull(extendedAddress, "extendedAddress");
            this.extendedAddress = extendedAddress;
            return this;
        }

        /**
         * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        /**
         * Postal code is the zip code of the individual. It can be either 5 digits (XXXXX) or ZIP+4 (XXXXX-XXXX).
         */
        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Region is the state or locality of the individual.
         */
        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * Region is the state or locality of the individual.
         */
        public Builder region(Optional<String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public V3ChallengeAddressEntryRequest build() {
            return new V3ChallengeAddressEntryRequest(
                address,
                city,
                extendedAddress,
                postalCode,
                region);
        }
    }
}

