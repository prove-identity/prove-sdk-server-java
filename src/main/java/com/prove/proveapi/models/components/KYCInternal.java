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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class KYCInternal {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amlTypeLists")
    private Optional<? extends List<AmlTypeListResponseInternal>> amlTypeLists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totalHits")
    private Optional<Long> totalHits;

    @JsonCreator
    public KYCInternal(
            @JsonProperty("amlTypeLists") Optional<? extends List<AmlTypeListResponseInternal>> amlTypeLists,
            @JsonProperty("totalHits") Optional<Long> totalHits) {
        Utils.checkNotNull(amlTypeLists, "amlTypeLists");
        Utils.checkNotNull(totalHits, "totalHits");
        this.amlTypeLists = amlTypeLists;
        this.totalHits = totalHits;
    }
    
    public KYCInternal() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AmlTypeListResponseInternal>> amlTypeLists() {
        return (Optional<List<AmlTypeListResponseInternal>>) amlTypeLists;
    }

    @JsonIgnore
    public Optional<Long> totalHits() {
        return totalHits;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public KYCInternal withAmlTypeLists(List<AmlTypeListResponseInternal> amlTypeLists) {
        Utils.checkNotNull(amlTypeLists, "amlTypeLists");
        this.amlTypeLists = Optional.ofNullable(amlTypeLists);
        return this;
    }

    public KYCInternal withAmlTypeLists(Optional<? extends List<AmlTypeListResponseInternal>> amlTypeLists) {
        Utils.checkNotNull(amlTypeLists, "amlTypeLists");
        this.amlTypeLists = amlTypeLists;
        return this;
    }

    public KYCInternal withTotalHits(long totalHits) {
        Utils.checkNotNull(totalHits, "totalHits");
        this.totalHits = Optional.ofNullable(totalHits);
        return this;
    }

    public KYCInternal withTotalHits(Optional<Long> totalHits) {
        Utils.checkNotNull(totalHits, "totalHits");
        this.totalHits = totalHits;
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
        KYCInternal other = (KYCInternal) o;
        return 
            Objects.deepEquals(this.amlTypeLists, other.amlTypeLists) &&
            Objects.deepEquals(this.totalHits, other.totalHits);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amlTypeLists,
            totalHits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(KYCInternal.class,
                "amlTypeLists", amlTypeLists,
                "totalHits", totalHits);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<AmlTypeListResponseInternal>> amlTypeLists = Optional.empty();
 
        private Optional<Long> totalHits = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amlTypeLists(List<AmlTypeListResponseInternal> amlTypeLists) {
            Utils.checkNotNull(amlTypeLists, "amlTypeLists");
            this.amlTypeLists = Optional.ofNullable(amlTypeLists);
            return this;
        }

        public Builder amlTypeLists(Optional<? extends List<AmlTypeListResponseInternal>> amlTypeLists) {
            Utils.checkNotNull(amlTypeLists, "amlTypeLists");
            this.amlTypeLists = amlTypeLists;
            return this;
        }

        public Builder totalHits(long totalHits) {
            Utils.checkNotNull(totalHits, "totalHits");
            this.totalHits = Optional.ofNullable(totalHits);
            return this;
        }

        public Builder totalHits(Optional<Long> totalHits) {
            Utils.checkNotNull(totalHits, "totalHits");
            this.totalHits = totalHits;
            return this;
        }
        
        public KYCInternal build() {
            return new KYCInternal(
                amlTypeLists,
                totalHits);
        }
    }
}

