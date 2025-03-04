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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DataSourceInternal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends DataSourceAddressResponseInternal> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cipConfidence")
    private Optional<String> cipConfidence;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends DataSourceEmailAddressResponseInternal> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifiers")
    private Optional<? extends DataSourceIdentifiersResponseInternal> identifiers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends DataSourceNameResponseInternal> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reasonCodes")
    private Optional<? extends List<String>> reasonCodes;

    @JsonCreator
    public DataSourceInternal(
            @JsonProperty("address") Optional<? extends DataSourceAddressResponseInternal> address,
            @JsonProperty("cipConfidence") Optional<String> cipConfidence,
            @JsonProperty("email") Optional<? extends DataSourceEmailAddressResponseInternal> email,
            @JsonProperty("identifiers") Optional<? extends DataSourceIdentifiersResponseInternal> identifiers,
            @JsonProperty("name") Optional<? extends DataSourceNameResponseInternal> name,
            @JsonProperty("reasonCodes") Optional<? extends List<String>> reasonCodes) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(cipConfidence, "cipConfidence");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(identifiers, "identifiers");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(reasonCodes, "reasonCodes");
        this.address = address;
        this.cipConfidence = cipConfidence;
        this.email = email;
        this.identifiers = identifiers;
        this.name = name;
        this.reasonCodes = reasonCodes;
    }
    
    public DataSourceInternal() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DataSourceAddressResponseInternal> address() {
        return (Optional<DataSourceAddressResponseInternal>) address;
    }

    @JsonIgnore
    public Optional<String> cipConfidence() {
        return cipConfidence;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DataSourceEmailAddressResponseInternal> email() {
        return (Optional<DataSourceEmailAddressResponseInternal>) email;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DataSourceIdentifiersResponseInternal> identifiers() {
        return (Optional<DataSourceIdentifiersResponseInternal>) identifiers;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DataSourceNameResponseInternal> name() {
        return (Optional<DataSourceNameResponseInternal>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> reasonCodes() {
        return (Optional<List<String>>) reasonCodes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DataSourceInternal withAddress(DataSourceAddressResponseInternal address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public DataSourceInternal withAddress(Optional<? extends DataSourceAddressResponseInternal> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public DataSourceInternal withCipConfidence(String cipConfidence) {
        Utils.checkNotNull(cipConfidence, "cipConfidence");
        this.cipConfidence = Optional.ofNullable(cipConfidence);
        return this;
    }

    public DataSourceInternal withCipConfidence(Optional<String> cipConfidence) {
        Utils.checkNotNull(cipConfidence, "cipConfidence");
        this.cipConfidence = cipConfidence;
        return this;
    }

    public DataSourceInternal withEmail(DataSourceEmailAddressResponseInternal email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public DataSourceInternal withEmail(Optional<? extends DataSourceEmailAddressResponseInternal> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public DataSourceInternal withIdentifiers(DataSourceIdentifiersResponseInternal identifiers) {
        Utils.checkNotNull(identifiers, "identifiers");
        this.identifiers = Optional.ofNullable(identifiers);
        return this;
    }

    public DataSourceInternal withIdentifiers(Optional<? extends DataSourceIdentifiersResponseInternal> identifiers) {
        Utils.checkNotNull(identifiers, "identifiers");
        this.identifiers = identifiers;
        return this;
    }

    public DataSourceInternal withName(DataSourceNameResponseInternal name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public DataSourceInternal withName(Optional<? extends DataSourceNameResponseInternal> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DataSourceInternal withReasonCodes(List<String> reasonCodes) {
        Utils.checkNotNull(reasonCodes, "reasonCodes");
        this.reasonCodes = Optional.ofNullable(reasonCodes);
        return this;
    }

    public DataSourceInternal withReasonCodes(Optional<? extends List<String>> reasonCodes) {
        Utils.checkNotNull(reasonCodes, "reasonCodes");
        this.reasonCodes = reasonCodes;
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
        DataSourceInternal other = (DataSourceInternal) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.cipConfidence, other.cipConfidence) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.identifiers, other.identifiers) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.reasonCodes, other.reasonCodes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            cipConfidence,
            email,
            identifiers,
            name,
            reasonCodes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataSourceInternal.class,
                "address", address,
                "cipConfidence", cipConfidence,
                "email", email,
                "identifiers", identifiers,
                "name", name,
                "reasonCodes", reasonCodes);
    }
    
    public final static class Builder {
 
        private Optional<? extends DataSourceAddressResponseInternal> address = Optional.empty();
 
        private Optional<String> cipConfidence = Optional.empty();
 
        private Optional<? extends DataSourceEmailAddressResponseInternal> email = Optional.empty();
 
        private Optional<? extends DataSourceIdentifiersResponseInternal> identifiers = Optional.empty();
 
        private Optional<? extends DataSourceNameResponseInternal> name = Optional.empty();
 
        private Optional<? extends List<String>> reasonCodes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(DataSourceAddressResponseInternal address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends DataSourceAddressResponseInternal> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder cipConfidence(String cipConfidence) {
            Utils.checkNotNull(cipConfidence, "cipConfidence");
            this.cipConfidence = Optional.ofNullable(cipConfidence);
            return this;
        }

        public Builder cipConfidence(Optional<String> cipConfidence) {
            Utils.checkNotNull(cipConfidence, "cipConfidence");
            this.cipConfidence = cipConfidence;
            return this;
        }

        public Builder email(DataSourceEmailAddressResponseInternal email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends DataSourceEmailAddressResponseInternal> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder identifiers(DataSourceIdentifiersResponseInternal identifiers) {
            Utils.checkNotNull(identifiers, "identifiers");
            this.identifiers = Optional.ofNullable(identifiers);
            return this;
        }

        public Builder identifiers(Optional<? extends DataSourceIdentifiersResponseInternal> identifiers) {
            Utils.checkNotNull(identifiers, "identifiers");
            this.identifiers = identifiers;
            return this;
        }

        public Builder name(DataSourceNameResponseInternal name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends DataSourceNameResponseInternal> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder reasonCodes(List<String> reasonCodes) {
            Utils.checkNotNull(reasonCodes, "reasonCodes");
            this.reasonCodes = Optional.ofNullable(reasonCodes);
            return this;
        }

        public Builder reasonCodes(Optional<? extends List<String>> reasonCodes) {
            Utils.checkNotNull(reasonCodes, "reasonCodes");
            this.reasonCodes = reasonCodes;
            return this;
        }
        
        public DataSourceInternal build() {
            return new DataSourceInternal(
                address,
                cipConfidence,
                email,
                identifiers,
                name,
                reasonCodes);
        }
    }
}

