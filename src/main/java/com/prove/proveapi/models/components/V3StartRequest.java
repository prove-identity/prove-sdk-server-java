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

public class V3StartRequest {

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<? extends String> dob;

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private Optional<? extends String> emailAddress;

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("finalTargetUrl")
    private Optional<? extends String> finalTargetUrl;

    /**
     * Flow type is based on the method used - either 'desktop' if using desktop or 'mobile' for iOS/Android native apps and mobile web. Acceptable options are: 'desktop' or 'mobile'.
     */
    @JsonProperty("flowType")
    private String flowType;

    /**
     * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ipAddress")
    private Optional<? extends String> ipAddress;

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phoneNumber")
    private Optional<? extends String> phoneNumber;

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<? extends String> ssn;

    @JsonCreator
    public V3StartRequest(
            @JsonProperty("dob") Optional<? extends String> dob,
            @JsonProperty("emailAddress") Optional<? extends String> emailAddress,
            @JsonProperty("finalTargetUrl") Optional<? extends String> finalTargetUrl,
            @JsonProperty("flowType") String flowType,
            @JsonProperty("ipAddress") Optional<? extends String> ipAddress,
            @JsonProperty("phoneNumber") Optional<? extends String> phoneNumber,
            @JsonProperty("ssn") Optional<? extends String> ssn) {
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        Utils.checkNotNull(flowType, "flowType");
        Utils.checkNotNull(ipAddress, "ipAddress");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(ssn, "ssn");
        this.dob = dob;
        this.emailAddress = emailAddress;
        this.finalTargetUrl = finalTargetUrl;
        this.flowType = flowType;
        this.ipAddress = ipAddress;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
    }
    
    public V3StartRequest(
            String flowType) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), flowType, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> dob() {
        return (Optional<String>) dob;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> emailAddress() {
        return (Optional<String>) emailAddress;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> finalTargetUrl() {
        return (Optional<String>) finalTargetUrl;
    }

    /**
     * Flow type is based on the method used - either 'desktop' if using desktop or 'mobile' for iOS/Android native apps and mobile web. Acceptable options are: 'desktop' or 'mobile'.
     */
    @JsonIgnore
    public String flowType() {
        return flowType;
    }

    /**
     * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> ipAddress() {
        return (Optional<String>) ipAddress;
    }

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> phoneNumber() {
        return (Optional<String>) phoneNumber;
    }

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
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
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3StartRequest withDob(String dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = Optional.ofNullable(dob);
        return this;
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    public V3StartRequest withDob(Optional<? extends String> dob) {
        Utils.checkNotNull(dob, "dob");
        this.dob = dob;
        return this;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    public V3StartRequest withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = Optional.ofNullable(emailAddress);
        return this;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    public V3StartRequest withEmailAddress(Optional<? extends String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    public V3StartRequest withFinalTargetUrl(String finalTargetUrl) {
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        this.finalTargetUrl = Optional.ofNullable(finalTargetUrl);
        return this;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    public V3StartRequest withFinalTargetUrl(Optional<? extends String> finalTargetUrl) {
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        this.finalTargetUrl = finalTargetUrl;
        return this;
    }

    /**
     * Flow type is based on the method used - either 'desktop' if using desktop or 'mobile' for iOS/Android native apps and mobile web. Acceptable options are: 'desktop' or 'mobile'.
     */
    public V3StartRequest withFlowType(String flowType) {
        Utils.checkNotNull(flowType, "flowType");
        this.flowType = flowType;
        return this;
    }

    /**
     * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
     */
    public V3StartRequest withIpAddress(String ipAddress) {
        Utils.checkNotNull(ipAddress, "ipAddress");
        this.ipAddress = Optional.ofNullable(ipAddress);
        return this;
    }

    /**
     * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
     */
    public V3StartRequest withIpAddress(Optional<? extends String> ipAddress) {
        Utils.checkNotNull(ipAddress, "ipAddress");
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    public V3StartRequest withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    public V3StartRequest withPhoneNumber(Optional<? extends String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
     */
    public V3StartRequest withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
     */
    public V3StartRequest withSsn(Optional<? extends String> ssn) {
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
        V3StartRequest other = (V3StartRequest) o;
        return 
            java.util.Objects.deepEquals(this.dob, other.dob) &&
            java.util.Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            java.util.Objects.deepEquals(this.finalTargetUrl, other.finalTargetUrl) &&
            java.util.Objects.deepEquals(this.flowType, other.flowType) &&
            java.util.Objects.deepEquals(this.ipAddress, other.ipAddress) &&
            java.util.Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            java.util.Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dob,
            emailAddress,
            finalTargetUrl,
            flowType,
            ipAddress,
            phoneNumber,
            ssn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3StartRequest.class,
                "dob", dob,
                "emailAddress", emailAddress,
                "finalTargetUrl", finalTargetUrl,
                "flowType", flowType,
                "ipAddress", ipAddress,
                "phoneNumber", phoneNumber,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> dob = Optional.empty();
 
        private Optional<? extends String> emailAddress = Optional.empty();
 
        private Optional<? extends String> finalTargetUrl = Optional.empty();
 
        private String flowType;
 
        private Optional<? extends String> ipAddress = Optional.empty();
 
        private Optional<? extends String> phoneNumber = Optional.empty();
 
        private Optional<? extends String> ssn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(String dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = Optional.ofNullable(dob);
            return this;
        }

        /**
         * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
         */
        public Builder dob(Optional<? extends String> dob) {
            Utils.checkNotNull(dob, "dob");
            this.dob = dob;
            return this;
        }

        /**
         * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = Optional.ofNullable(emailAddress);
            return this;
        }

        /**
         * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
         */
        public Builder emailAddress(Optional<? extends String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
         */
        public Builder finalTargetUrl(String finalTargetUrl) {
            Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
            this.finalTargetUrl = Optional.ofNullable(finalTargetUrl);
            return this;
        }

        /**
         * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
         */
        public Builder finalTargetUrl(Optional<? extends String> finalTargetUrl) {
            Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
            this.finalTargetUrl = finalTargetUrl;
            return this;
        }

        /**
         * Flow type is based on the method used - either 'desktop' if using desktop or 'mobile' for iOS/Android native apps and mobile web. Acceptable options are: 'desktop' or 'mobile'.
         */
        public Builder flowType(String flowType) {
            Utils.checkNotNull(flowType, "flowType");
            this.flowType = flowType;
            return this;
        }

        /**
         * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
         */
        public Builder ipAddress(String ipAddress) {
            Utils.checkNotNull(ipAddress, "ipAddress");
            this.ipAddress = Optional.ofNullable(ipAddress);
            return this;
        }

        /**
         * IP address is the IP address of the device of the customer. Acceptable characters are: numeric with symbols ':.'.
         */
        public Builder ipAddress(Optional<? extends String> ipAddress) {
            Utils.checkNotNull(ipAddress, "ipAddress");
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        /**
         * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
         */
        public Builder phoneNumber(Optional<? extends String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
         */
        public Builder ssn(String ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        /**
         * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
         */
        public Builder ssn(Optional<? extends String> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }
        
        public V3StartRequest build() {
            return new V3StartRequest(
                dob,
                emailAddress,
                finalTargetUrl,
                flowType,
                ipAddress,
                phoneNumber,
                ssn);
        }
    }
}

