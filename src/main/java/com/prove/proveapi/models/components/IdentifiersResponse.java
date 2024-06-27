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

public class IdentifiersResponse {

    /**
     * A boolean value indicating if the date of birth was matched during processing.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<? extends Boolean> dob;

    /**
     * The results of the driver's license match*.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("driversLicenseNumber")
    private Optional<? extends Boolean> driversLicenseNumber;

    /**
     * The results of the driver's license state match*.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("driversLicenseState")
    private Optional<? extends Boolean> driversLicenseState;

    /**
     * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last4")
    private Optional<? extends Boolean> last4;

    /**
     * The results of the full SSN match*.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<? extends Boolean> ssn;

    @JsonCreator
    public IdentifiersResponse(
            @JsonProperty("dob") Optional<? extends Boolean> dob,
            @JsonProperty("driversLicenseNumber") Optional<? extends Boolean> driversLicenseNumber,
            @JsonProperty("driversLicenseState") Optional<? extends Boolean> driversLicenseState,
            @JsonProperty("last4") Optional<? extends Boolean> last4,
            @JsonProperty("ssn") Optional<? extends Boolean> ssn) {
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(driversLicenseNumber, "driversLicenseNumber");
        Utils.checkNotNull(driversLicenseState, "driversLicenseState");
        Utils.checkNotNull(last4, "last4");
        Utils.checkNotNull(ssn, "ssn");
        this.dob = dob;
        this.driversLicenseNumber = driversLicenseNumber;
        this.driversLicenseState = driversLicenseState;
        this.last4 = last4;
        this.ssn = ssn;
    }
    
    public IdentifiersResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A boolean value indicating if the date of birth was matched during processing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> dob() {
        return (Optional<Boolean>) dob;
    }

    /**
     * The results of the driver's license match*.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> driversLicenseNumber() {
        return (Optional<Boolean>) driversLicenseNumber;
    }

    /**
     * The results of the driver's license state match*.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> driversLicenseState() {
        return (Optional<Boolean>) driversLicenseState;
    }

    /**
     * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> last4() {
        return (Optional<Boolean>) last4;
    }

    /**
     * The results of the full SSN match*.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> ssn() {
        return (Optional<Boolean>) ssn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A boolean value indicating if the date of birth was matched during processing.
     */
    public IdentifiersResponse withDob(boolean dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    /**
     * A boolean value indicating if the date of birth was matched during processing.
     */
    public IdentifiersResponse withDob(Optional<? extends Boolean> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    /**
     * The results of the driver's license match*.
     */
    public IdentifiersResponse withDriversLicenseNumber(boolean driversLicenseNumber) {
        Utils.checkNotNull(driversLicenseNumber, "driversLicenseNumber");
        this.driversLicenseNumber = Optional.ofNullable(driversLicenseNumber);
        return this;
    }

    /**
     * The results of the driver's license match*.
     */
    public IdentifiersResponse withDriversLicenseNumber(Optional<? extends Boolean> driversLicenseNumber) {
        Utils.checkNotNull(driversLicenseNumber, "driversLicenseNumber");
        this.driversLicenseNumber = driversLicenseNumber;
        return this;
    }

    /**
     * The results of the driver's license state match*.
     */
    public IdentifiersResponse withDriversLicenseState(boolean driversLicenseState) {
        Utils.checkNotNull(driversLicenseState, "driversLicenseState");
        this.driversLicenseState = Optional.ofNullable(driversLicenseState);
        return this;
    }

    /**
     * The results of the driver's license state match*.
     */
    public IdentifiersResponse withDriversLicenseState(Optional<? extends Boolean> driversLicenseState) {
        Utils.checkNotNull(driversLicenseState, "driversLicenseState");
        this.driversLicenseState = driversLicenseState;
        return this;
    }

    /**
     * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
     */
    public IdentifiersResponse withLast4(boolean last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = Optional.ofNullable(last4);
        return this;
    }

    /**
     * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
     */
    public IdentifiersResponse withLast4(Optional<? extends Boolean> last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = last4;
        return this;
    }

    /**
     * The results of the full SSN match*.
     */
    public IdentifiersResponse withSsn(boolean ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    /**
     * The results of the full SSN match*.
     */
    public IdentifiersResponse withSsn(Optional<? extends Boolean> ssn) {
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
        IdentifiersResponse other = (IdentifiersResponse) o;
        return 
            java.util.Objects.deepEquals(this.dob, other.dob) &&
            java.util.Objects.deepEquals(this.driversLicenseNumber, other.driversLicenseNumber) &&
            java.util.Objects.deepEquals(this.driversLicenseState, other.driversLicenseState) &&
            java.util.Objects.deepEquals(this.last4, other.last4) &&
            java.util.Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dob,
            driversLicenseNumber,
            driversLicenseState,
            last4,
            ssn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IdentifiersResponse.class,
                "dob", dob,
                "driversLicenseNumber", driversLicenseNumber,
                "driversLicenseState", driversLicenseState,
                "last4", last4,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> dob = Optional.empty();
 
        private Optional<? extends Boolean> driversLicenseNumber = Optional.empty();
 
        private Optional<? extends Boolean> driversLicenseState = Optional.empty();
 
        private Optional<? extends Boolean> last4 = Optional.empty();
 
        private Optional<? extends Boolean> ssn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A boolean value indicating if the date of birth was matched during processing.
         */
        public Builder dob(boolean dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        /**
         * A boolean value indicating if the date of birth was matched during processing.
         */
        public Builder dob(Optional<? extends Boolean> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        /**
         * The results of the driver's license match*.
         */
        public Builder driversLicenseNumber(boolean driversLicenseNumber) {
            Utils.checkNotNull(driversLicenseNumber, "driversLicenseNumber");
            this.driversLicenseNumber = Optional.ofNullable(driversLicenseNumber);
            return this;
        }

        /**
         * The results of the driver's license match*.
         */
        public Builder driversLicenseNumber(Optional<? extends Boolean> driversLicenseNumber) {
            Utils.checkNotNull(driversLicenseNumber, "driversLicenseNumber");
            this.driversLicenseNumber = driversLicenseNumber;
            return this;
        }

        /**
         * The results of the driver's license state match*.
         */
        public Builder driversLicenseState(boolean driversLicenseState) {
            Utils.checkNotNull(driversLicenseState, "driversLicenseState");
            this.driversLicenseState = Optional.ofNullable(driversLicenseState);
            return this;
        }

        /**
         * The results of the driver's license state match*.
         */
        public Builder driversLicenseState(Optional<? extends Boolean> driversLicenseState) {
            Utils.checkNotNull(driversLicenseState, "driversLicenseState");
            this.driversLicenseState = driversLicenseState;
            return this;
        }

        /**
         * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
         */
        public Builder last4(boolean last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = Optional.ofNullable(last4);
            return this;
        }

        /**
         * A boolean value indicating if the last 4 digits of the social security number were matched during processing.
         */
        public Builder last4(Optional<? extends Boolean> last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = last4;
            return this;
        }

        /**
         * The results of the full SSN match*.
         */
        public Builder ssn(boolean ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        /**
         * The results of the full SSN match*.
         */
        public Builder ssn(Optional<? extends Boolean> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }
        
        public IdentifiersResponse build() {
            return new IdentifiersResponse(
                dob,
                driversLicenseNumber,
                driversLicenseState,
                last4,
                ssn);
        }
    }
}

