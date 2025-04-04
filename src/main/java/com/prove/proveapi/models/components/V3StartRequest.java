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

public class V3StartRequest {

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dob")
    private Optional<String> dob;

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emailAddress")
    private Optional<String> emailAddress;

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("finalTargetUrl")
    private Optional<String> finalTargetUrl;

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
    private Optional<String> ipAddress;

    /**
     * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phoneNumber")
    private Optional<String> phoneNumber;

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * <p>The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("smsMessage")
    private Optional<String> smsMessage;

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<String> ssn;

    @JsonCreator
    public V3StartRequest(
            @JsonProperty("dob") Optional<String> dob,
            @JsonProperty("emailAddress") Optional<String> emailAddress,
            @JsonProperty("finalTargetUrl") Optional<String> finalTargetUrl,
            @JsonProperty("flowType") String flowType,
            @JsonProperty("ipAddress") Optional<String> ipAddress,
            @JsonProperty("phoneNumber") Optional<String> phoneNumber,
            @JsonProperty("smsMessage") Optional<String> smsMessage,
            @JsonProperty("ssn") Optional<String> ssn) {
        Utils.checkNotNull(dob, "dob");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        Utils.checkNotNull(flowType, "flowType");
        Utils.checkNotNull(ipAddress, "ipAddress");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(smsMessage, "smsMessage");
        Utils.checkNotNull(ssn, "ssn");
        this.dob = dob;
        this.emailAddress = emailAddress;
        this.finalTargetUrl = finalTargetUrl;
        this.flowType = flowType;
        this.ipAddress = ipAddress;
        this.phoneNumber = phoneNumber;
        this.smsMessage = smsMessage;
        this.ssn = ssn;
    }
    
    public V3StartRequest(
            String flowType) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), flowType, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * DOB, an optional challenge, is the date of birth in one of these formats: YYYY-MM-DD, YYYY-MM, or MM-DD. Acceptable characters are: numeric with symbol '-'.
     */
    @JsonIgnore
    public Optional<String> dob() {
        return dob;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    @JsonIgnore
    public Optional<String> emailAddress() {
        return emailAddress;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    @JsonIgnore
    public Optional<String> finalTargetUrl() {
        return finalTargetUrl;
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
    @JsonIgnore
    public Optional<String> ipAddress() {
        return ipAddress;
    }

    /**
     * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @JsonIgnore
    public Optional<String> phoneNumber() {
        return phoneNumber;
    }

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * <p>The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    @JsonIgnore
    public Optional<String> smsMessage() {
        return smsMessage;
    }

    /**
     * SSN, an optional challenge, is either the full or last 4 digits of the social security number. Acceptable characters are: numeric.
     */
    @JsonIgnore
    public Optional<String> ssn() {
        return ssn;
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
    public V3StartRequest withDob(Optional<String> dob) {
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
    public V3StartRequest withEmailAddress(Optional<String> emailAddress) {
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
    public V3StartRequest withFinalTargetUrl(Optional<String> finalTargetUrl) {
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
    public V3StartRequest withIpAddress(Optional<String> ipAddress) {
        Utils.checkNotNull(ipAddress, "ipAddress");
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
     */
    public V3StartRequest withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    /**
     * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
     */
    public V3StartRequest withPhoneNumber(Optional<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * <p>The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    public V3StartRequest withSmsMessage(String smsMessage) {
        Utils.checkNotNull(smsMessage, "smsMessage");
        this.smsMessage = Optional.ofNullable(smsMessage);
        return this;
    }

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * <p>The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    public V3StartRequest withSmsMessage(Optional<String> smsMessage) {
        Utils.checkNotNull(smsMessage, "smsMessage");
        this.smsMessage = smsMessage;
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
    public V3StartRequest withSsn(Optional<String> ssn) {
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
            Objects.deepEquals(this.dob, other.dob) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.finalTargetUrl, other.finalTargetUrl) &&
            Objects.deepEquals(this.flowType, other.flowType) &&
            Objects.deepEquals(this.ipAddress, other.ipAddress) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.smsMessage, other.smsMessage) &&
            Objects.deepEquals(this.ssn, other.ssn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dob,
            emailAddress,
            finalTargetUrl,
            flowType,
            ipAddress,
            phoneNumber,
            smsMessage,
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
                "smsMessage", smsMessage,
                "ssn", ssn);
    }
    
    public final static class Builder {
 
        private Optional<String> dob = Optional.empty();
 
        private Optional<String> emailAddress = Optional.empty();
 
        private Optional<String> finalTargetUrl = Optional.empty();
 
        private String flowType;
 
        private Optional<String> ipAddress = Optional.empty();
 
        private Optional<String> phoneNumber = Optional.empty();
 
        private Optional<String> smsMessage = Optional.empty();
 
        private Optional<String> ssn = Optional.empty();
        
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
        public Builder dob(Optional<String> dob) {
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
        public Builder emailAddress(Optional<String> emailAddress) {
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
        public Builder finalTargetUrl(Optional<String> finalTargetUrl) {
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
        public Builder ipAddress(Optional<String> ipAddress) {
            Utils.checkNotNull(ipAddress, "ipAddress");
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        /**
         * Phone number is the number of the mobile phone. Refer to the Prove Pre-Fill with Mobile Auth and Prove Identity with Mobile Auth documentation for situations where this field is not required. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.
         */
        public Builder phoneNumber(Optional<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
         * If not provided, the following default messages will be used:
         * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
         * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
         * Max length is 160 characters. Only ASCII characters are allowed.
         * 
         * <p>The placeholder format varies by flow type:
         * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
         * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
         */
        public Builder smsMessage(String smsMessage) {
            Utils.checkNotNull(smsMessage, "smsMessage");
            this.smsMessage = Optional.ofNullable(smsMessage);
            return this;
        }

        /**
         * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
         * If not provided, the following default messages will be used:
         * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
         * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
         * Max length is 160 characters. Only ASCII characters are allowed.
         * 
         * <p>The placeholder format varies by flow type:
         * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
         * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
         */
        public Builder smsMessage(Optional<String> smsMessage) {
            Utils.checkNotNull(smsMessage, "smsMessage");
            this.smsMessage = smsMessage;
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
        public Builder ssn(Optional<String> ssn) {
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
                smsMessage,
                ssn);
        }
    }
}
