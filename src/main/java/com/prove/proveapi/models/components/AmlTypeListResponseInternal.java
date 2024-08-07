/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class AmlTypeListResponseInternal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amlType")
    private Optional<? extends String> amlType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private Optional<? extends java.util.List<KYCFieldTypeResponseInternal>> fields;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("listHits")
    private Optional<? extends Long> listHits;

    @JsonCreator
    public AmlTypeListResponseInternal(
            @JsonProperty("amlType") Optional<? extends String> amlType,
            @JsonProperty("fields") Optional<? extends java.util.List<KYCFieldTypeResponseInternal>> fields,
            @JsonProperty("listHits") Optional<? extends Long> listHits) {
        Utils.checkNotNull(amlType, "amlType");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(listHits, "listHits");
        this.amlType = amlType;
        this.fields = fields;
        this.listHits = listHits;
    }
    
    public AmlTypeListResponseInternal() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> amlType() {
        return (Optional<String>) amlType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<KYCFieldTypeResponseInternal>> fields() {
        return (Optional<java.util.List<KYCFieldTypeResponseInternal>>) fields;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> listHits() {
        return (Optional<Long>) listHits;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AmlTypeListResponseInternal withAmlType(String amlType) {
        Utils.checkNotNull(amlType, "amlType");
        this.amlType = Optional.ofNullable(amlType);
        return this;
    }

    public AmlTypeListResponseInternal withAmlType(Optional<? extends String> amlType) {
        Utils.checkNotNull(amlType, "amlType");
        this.amlType = amlType;
        return this;
    }

    public AmlTypeListResponseInternal withFields(java.util.List<KYCFieldTypeResponseInternal> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    public AmlTypeListResponseInternal withFields(Optional<? extends java.util.List<KYCFieldTypeResponseInternal>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public AmlTypeListResponseInternal withListHits(long listHits) {
        Utils.checkNotNull(listHits, "listHits");
        this.listHits = Optional.ofNullable(listHits);
        return this;
    }

    public AmlTypeListResponseInternal withListHits(Optional<? extends Long> listHits) {
        Utils.checkNotNull(listHits, "listHits");
        this.listHits = listHits;
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
        AmlTypeListResponseInternal other = (AmlTypeListResponseInternal) o;
        return 
            java.util.Objects.deepEquals(this.amlType, other.amlType) &&
            java.util.Objects.deepEquals(this.fields, other.fields) &&
            java.util.Objects.deepEquals(this.listHits, other.listHits);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amlType,
            fields,
            listHits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AmlTypeListResponseInternal.class,
                "amlType", amlType,
                "fields", fields,
                "listHits", listHits);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> amlType = Optional.empty();
 
        private Optional<? extends java.util.List<KYCFieldTypeResponseInternal>> fields = Optional.empty();
 
        private Optional<? extends Long> listHits = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amlType(String amlType) {
            Utils.checkNotNull(amlType, "amlType");
            this.amlType = Optional.ofNullable(amlType);
            return this;
        }

        public Builder amlType(Optional<? extends String> amlType) {
            Utils.checkNotNull(amlType, "amlType");
            this.amlType = amlType;
            return this;
        }

        public Builder fields(java.util.List<KYCFieldTypeResponseInternal> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        public Builder fields(Optional<? extends java.util.List<KYCFieldTypeResponseInternal>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        public Builder listHits(long listHits) {
            Utils.checkNotNull(listHits, "listHits");
            this.listHits = Optional.ofNullable(listHits);
            return this;
        }

        public Builder listHits(Optional<? extends Long> listHits) {
            Utils.checkNotNull(listHits, "listHits");
            this.listHits = listHits;
            return this;
        }
        
        public AmlTypeListResponseInternal build() {
            return new AmlTypeListResponseInternal(
                amlType,
                fields,
                listHits);
        }
    }
}

