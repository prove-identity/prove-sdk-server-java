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
import com.prove.sdk.proveapi.utils.LazySingletonValue;
import com.prove.sdk.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class AddressEntry {

    /**
     * Address is the street address of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends String> address;

    /**
     * City of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<? extends String> city;

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extendedAddress")
    private Optional<? extends String> extendedAddress;

    /**
     * Postal code is the zip code of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<? extends String> postalCode;

    /**
     * Region is the state or locality of the individual.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("region")
    private Optional<? extends String> region;

    @JsonCreator
    public AddressEntry(
            @JsonProperty("address") Optional<? extends String> address,
            @JsonProperty("city") Optional<? extends String> city,
            @JsonProperty("extendedAddress") Optional<? extends String> extendedAddress,
            @JsonProperty("postalCode") Optional<? extends String> postalCode,
            @JsonProperty("region") Optional<? extends String> region) {
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
    
    public AddressEntry() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Address is the street address of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> address() {
        return (Optional<String>) address;
    }

    /**
     * City of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> city() {
        return (Optional<String>) city;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> extendedAddress() {
        return (Optional<String>) extendedAddress;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> postalCode() {
        return (Optional<String>) postalCode;
    }

    /**
     * Region is the state or locality of the individual.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> region() {
        return (Optional<String>) region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Address is the street address of the individual.
     */
    public AddressEntry withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Address is the street address of the individual.
     */
    public AddressEntry withAddress(Optional<? extends String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * City of the individual.
     */
    public AddressEntry withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    /**
     * City of the individual.
     */
    public AddressEntry withCity(Optional<? extends String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public AddressEntry withExtendedAddress(String extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = Optional.ofNullable(extendedAddress);
        return this;
    }

    /**
     * Extended address is the apartment number or other extended address information.
     */
    public AddressEntry withExtendedAddress(Optional<? extends String> extendedAddress) {
        Utils.checkNotNull(extendedAddress, "extendedAddress");
        this.extendedAddress = extendedAddress;
        return this;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    public AddressEntry withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    /**
     * Postal code is the zip code of the individual.
     */
    public AddressEntry withPostalCode(Optional<? extends String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public AddressEntry withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.ofNullable(region);
        return this;
    }

    /**
     * Region is the state or locality of the individual.
     */
    public AddressEntry withRegion(Optional<? extends String> region) {
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
        AddressEntry other = (AddressEntry) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.city, other.city) &&
            java.util.Objects.deepEquals(this.extendedAddress, other.extendedAddress) &&
            java.util.Objects.deepEquals(this.postalCode, other.postalCode) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            city,
            extendedAddress,
            postalCode,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddressEntry.class,
                "address", address,
                "city", city,
                "extendedAddress", extendedAddress,
                "postalCode", postalCode,
                "region", region);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> address;
 
        private Optional<? extends String> city;
 
        private Optional<? extends String> extendedAddress = Optional.empty();
 
        private Optional<? extends String> postalCode;
 
        private Optional<? extends String> region;  
        
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
        public Builder address(Optional<? extends String> address) {
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
        public Builder city(Optional<? extends String> city) {
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
        public Builder extendedAddress(Optional<? extends String> extendedAddress) {
            Utils.checkNotNull(extendedAddress, "extendedAddress");
            this.extendedAddress = extendedAddress;
            return this;
        }

        /**
         * Postal code is the zip code of the individual.
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        /**
         * Postal code is the zip code of the individual.
         */
        public Builder postalCode(Optional<? extends String> postalCode) {
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
        public Builder region(Optional<? extends String> region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public AddressEntry build() {
            if (address == null) {
                address = _SINGLETON_VALUE_Address.value();
            }
            if (city == null) {
                city = _SINGLETON_VALUE_City.value();
            }
            if (postalCode == null) {
                postalCode = _SINGLETON_VALUE_PostalCode.value();
            }
            if (region == null) {
                region = _SINGLETON_VALUE_Region.value();
            }
            return new AddressEntry(
                address,
                city,
                extendedAddress,
                postalCode,
                region);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Address =
                new LazySingletonValue<>(
                        "address",
                        "\"39 South Trail\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_City =
                new LazySingletonValue<>(
                        "city",
                        "\"San Antonio\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_PostalCode =
                new LazySingletonValue<>(
                        "postalCode",
                        "\"78285\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_Region =
                new LazySingletonValue<>(
                        "region",
                        "\"TX\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

