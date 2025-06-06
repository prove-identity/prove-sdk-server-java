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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class DataSourceIdentifiersResponseInternal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<Boolean> dob;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last4")
    private Optional<Boolean> last4;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<Boolean> ssn;

    @JsonCreator
    public DataSourceIdentifiersResponseInternal(
            @JsonProperty("dob") Optional<Boolean> dob,
            @JsonProperty("last4") Optional<Boolean> last4,
            @JsonProperty("ssn") Optional<Boolean> ssn) {
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(last4, "last4");
        Utils.checkNotNull(ssn, "ssn");
        this.dob = dob;
        this.last4 = last4;
        this.ssn = ssn;
    }
    
    public DataSourceIdentifiersResponseInternal() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> dob() {
        return dob;
    }

    @JsonIgnore
    public Optional<Boolean> last4() {
        return last4;
    }

    @JsonIgnore
    public Optional<Boolean> ssn() {
        return ssn;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DataSourceIdentifiersResponseInternal withDob(boolean dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    public DataSourceIdentifiersResponseInternal withDob(Optional<Boolean> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    public DataSourceIdentifiersResponseInternal withLast4(boolean last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = Optional.ofNullable(last4);
        return this;
    }

    public DataSourceIdentifiersResponseInternal withLast4(Optional<Boolean> last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = last4;
        return this;
    }

    public DataSourceIdentifiersResponseInternal withSsn(boolean ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    public DataSourceIdentifiersResponseInternal withSsn(Optional<Boolean> ssn) {
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
        DataSourceIdentifiersResponseInternal other = (DataSourceIdentifiersResponseInternal) o;
        return 
            Objects.deepEquals(this.dob, other.dob) &&
            Objects.deepEquals(this.last4, other.last4) &&
            Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dob,
            last4,
            ssn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DataSourceIdentifiersResponseInternal.class,
                "dob", dob,
                "last4", last4,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> dob = Optional.empty();
 
        private Optional<Boolean> last4 = Optional.empty();
 
        private Optional<Boolean> ssn = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dob(boolean dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        public Builder dob(Optional<Boolean> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        public Builder last4(boolean last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = Optional.ofNullable(last4);
            return this;
        }

        public Builder last4(Optional<Boolean> last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = last4;
            return this;
        }

        public Builder ssn(boolean ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        public Builder ssn(Optional<Boolean> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }
        
        public DataSourceIdentifiersResponseInternal build() {
            return new DataSourceIdentifiersResponseInternal(
                dob,
                last4,
                ssn);
        }
    }
}
