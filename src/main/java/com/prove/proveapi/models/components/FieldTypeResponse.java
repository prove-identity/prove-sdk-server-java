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

public class FieldTypeResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Source")
    private Optional<? extends String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Value")
    private Optional<? extends String> value;

    @JsonCreator
    public FieldTypeResponse(
            @JsonProperty("Name") Optional<? extends String> name,
            @JsonProperty("Source") Optional<? extends String> source,
            @JsonProperty("Value") Optional<? extends String> value) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(value, "value");
        this.name = name;
        this.source = source;
        this.value = value;
    }
    
    public FieldTypeResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> source() {
        return (Optional<String>) source;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> value() {
        return (Optional<String>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FieldTypeResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public FieldTypeResponse withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public FieldTypeResponse withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    public FieldTypeResponse withSource(Optional<? extends String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public FieldTypeResponse withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public FieldTypeResponse withValue(Optional<? extends String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        FieldTypeResponse other = (FieldTypeResponse) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.source, other.source) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            source,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FieldTypeResponse.class,
                "name", name,
                "source", source,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> source = Optional.empty();
 
        private Optional<? extends String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        public Builder source(Optional<? extends String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<? extends String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public FieldTypeResponse build() {
            return new FieldTypeResponse(
                name,
                source,
                value);
        }
    }
}
