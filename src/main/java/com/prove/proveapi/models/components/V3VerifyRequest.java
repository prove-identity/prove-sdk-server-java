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

/**
 * V3VerifyRequest - Request body for the V3 Verify API
 */

public class V3VerifyRequest {

    /**
     * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientCustomerId")
    private Optional<String> clientCustomerId;

    /**
     * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientRequestId")
    private Optional<String> clientRequestId;

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
     * First name of the individual.
     */
    @JsonProperty("firstName")
    private String firstName;

    /**
     * Last name of the individual.
     */
    @JsonProperty("lastName")
    private String lastName;

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * Possession type is based on the method used - either 'desktop' if using desktop, 'mobile' for iOS/Android native apps and mobile web, or 'none' if no possession check is required. Acceptable options are: 'desktop', 'mobile', and 'none'.
     */
    @JsonProperty("possessionType")
    private String possessionType;

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("smsMessage")
    private Optional<String> smsMessage;

    @JsonCreator
    public V3VerifyRequest(
            @JsonProperty("clientCustomerId") Optional<String> clientCustomerId,
            @JsonProperty("clientRequestId") Optional<String> clientRequestId,
            @JsonProperty("emailAddress") Optional<String> emailAddress,
            @JsonProperty("finalTargetUrl") Optional<String> finalTargetUrl,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("phoneNumber") String phoneNumber,
            @JsonProperty("possessionType") String possessionType,
            @JsonProperty("smsMessage") Optional<String> smsMessage) {
        Utils.checkNotNull(clientCustomerId, "clientCustomerId");
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(possessionType, "possessionType");
        Utils.checkNotNull(smsMessage, "smsMessage");
        this.clientCustomerId = clientCustomerId;
        this.clientRequestId = clientRequestId;
        this.emailAddress = emailAddress;
        this.finalTargetUrl = finalTargetUrl;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.possessionType = possessionType;
        this.smsMessage = smsMessage;
    }
    
    public V3VerifyRequest(
            String firstName,
            String lastName,
            String phoneNumber,
            String possessionType) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), firstName, lastName, phoneNumber, possessionType, Optional.empty());
    }

    /**
     * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonIgnore
    public Optional<String> clientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonIgnore
    public Optional<String> clientRequestId() {
        return clientRequestId;
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
     * First name of the individual.
     */
    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    /**
     * Last name of the individual.
     */
    @JsonIgnore
    public String lastName() {
        return lastName;
    }

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    @JsonIgnore
    public String phoneNumber() {
        return phoneNumber;
    }

    /**
     * Possession type is based on the method used - either 'desktop' if using desktop, 'mobile' for iOS/Android native apps and mobile web, or 'none' if no possession check is required. Acceptable options are: 'desktop', 'mobile', and 'none'.
     */
    @JsonIgnore
    public String possessionType() {
        return possessionType;
    }

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    @JsonIgnore
    public Optional<String> smsMessage() {
        return smsMessage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3VerifyRequest withClientCustomerId(String clientCustomerId) {
        Utils.checkNotNull(clientCustomerId, "clientCustomerId");
        this.clientCustomerId = Optional.ofNullable(clientCustomerId);
        return this;
    }

    /**
     * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3VerifyRequest withClientCustomerId(Optional<String> clientCustomerId) {
        Utils.checkNotNull(clientCustomerId, "clientCustomerId");
        this.clientCustomerId = clientCustomerId;
        return this;
    }

    /**
     * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3VerifyRequest withClientRequestId(String clientRequestId) {
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        this.clientRequestId = Optional.ofNullable(clientRequestId);
        return this;
    }

    /**
     * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3VerifyRequest withClientRequestId(Optional<String> clientRequestId) {
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    public V3VerifyRequest withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = Optional.ofNullable(emailAddress);
        return this;
    }

    /**
     * Email is the email address of the customer. Acceptable characters are: alphanumeric with symbols '@.+'.
     */
    public V3VerifyRequest withEmailAddress(Optional<String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    public V3VerifyRequest withFinalTargetUrl(String finalTargetUrl) {
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        this.finalTargetUrl = Optional.ofNullable(finalTargetUrl);
        return this;
    }

    /**
     * Final target URL is only required for when flowType=desktop. The final target URL is where the end user will be redirected at the end of Instant Link flow. Acceptable characters are: alphanumeric with symbols '-._+=/:?'.
     */
    public V3VerifyRequest withFinalTargetUrl(Optional<String> finalTargetUrl) {
        Utils.checkNotNull(finalTargetUrl, "finalTargetUrl");
        this.finalTargetUrl = finalTargetUrl;
        return this;
    }

    /**
     * First name of the individual.
     */
    public V3VerifyRequest withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the individual.
     */
    public V3VerifyRequest withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
     */
    public V3VerifyRequest withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Possession type is based on the method used - either 'desktop' if using desktop, 'mobile' for iOS/Android native apps and mobile web, or 'none' if no possession check is required. Acceptable options are: 'desktop', 'mobile', and 'none'.
     */
    public V3VerifyRequest withPossessionType(String possessionType) {
        Utils.checkNotNull(possessionType, "possessionType");
        this.possessionType = possessionType;
        return this;
    }

    /**
     * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
     * If not provided, the following default messages will be used:
     * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
     * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
     * Max length is 160 characters. Only ASCII characters are allowed.
     * 
     * The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    public V3VerifyRequest withSmsMessage(String smsMessage) {
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
     * The placeholder format varies by flow type:
     * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
     * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
     */
    public V3VerifyRequest withSmsMessage(Optional<String> smsMessage) {
        Utils.checkNotNull(smsMessage, "smsMessage");
        this.smsMessage = smsMessage;
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
        V3VerifyRequest other = (V3VerifyRequest) o;
        return 
            Objects.deepEquals(this.clientCustomerId, other.clientCustomerId) &&
            Objects.deepEquals(this.clientRequestId, other.clientRequestId) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.finalTargetUrl, other.finalTargetUrl) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.possessionType, other.possessionType) &&
            Objects.deepEquals(this.smsMessage, other.smsMessage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientCustomerId,
            clientRequestId,
            emailAddress,
            finalTargetUrl,
            firstName,
            lastName,
            phoneNumber,
            possessionType,
            smsMessage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3VerifyRequest.class,
                "clientCustomerId", clientCustomerId,
                "clientRequestId", clientRequestId,
                "emailAddress", emailAddress,
                "finalTargetUrl", finalTargetUrl,
                "firstName", firstName,
                "lastName", lastName,
                "phoneNumber", phoneNumber,
                "possessionType", possessionType,
                "smsMessage", smsMessage);
    }
    
    public final static class Builder {
 
        private Optional<String> clientCustomerId = Optional.empty();
 
        private Optional<String> clientRequestId = Optional.empty();
 
        private Optional<String> emailAddress = Optional.empty();
 
        private Optional<String> finalTargetUrl = Optional.empty();
 
        private String firstName;
 
        private String lastName;
 
        private String phoneNumber;
 
        private String possessionType;
 
        private Optional<String> smsMessage = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientCustomerId(String clientCustomerId) {
            Utils.checkNotNull(clientCustomerId, "clientCustomerId");
            this.clientCustomerId = Optional.ofNullable(clientCustomerId);
            return this;
        }

        /**
         * Client Customer ID is a client-generated unique ID for a specific customer. This can be used by clients to link calls related to the same customer, across different requests or sessions.  The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientCustomerId(Optional<String> clientCustomerId) {
            Utils.checkNotNull(clientCustomerId, "clientCustomerId");
            this.clientCustomerId = clientCustomerId;
            return this;
        }

        /**
         * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientRequestId(String clientRequestId) {
            Utils.checkNotNull(clientRequestId, "clientRequestId");
            this.clientRequestId = Optional.ofNullable(clientRequestId);
            return this;
        }

        /**
         * Client Request ID is a client-generated unique ID for a specific session. This can be used by clients to identify specific requests made to Prove Link. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Prove does not offer any functionality around the Client Request ID at this time, and this is expected to be added in a future release. NOTE: Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientRequestId(Optional<String> clientRequestId) {
            Utils.checkNotNull(clientRequestId, "clientRequestId");
            this.clientRequestId = clientRequestId;
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
         * First name of the individual.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the individual.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Phone number is the number of the mobile phone. The field is required in the Sandbox environment. In Production, you will likely pass the phone number via the Prove Link client SDK instead of within the Start call depending on how your user experience is implemented. Acceptable characters are: alphanumeric with symbols '+'.
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Possession type is based on the method used - either 'desktop' if using desktop, 'mobile' for iOS/Android native apps and mobile web, or 'none' if no possession check is required. Acceptable options are: 'desktop', 'mobile', and 'none'.
         */
        public Builder possessionType(String possessionType) {
            Utils.checkNotNull(possessionType, "possessionType");
            this.possessionType = possessionType;
            return this;
        }

        /**
         * SMSMessage is an optional field to customize the message body sent in the Instant Link (flowType=desktop) or OTP (on mobile) SMS message.
         * If not provided, the following default messages will be used:
         * 1. For Instant Link: "Complete your verification. If you did not make this request, do not click the link. ####"
         * 2. For OTP: "#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone."
         * Max length is 160 characters. Only ASCII characters are allowed.
         * 
         * The placeholder format varies by flow type:
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
         * The placeholder format varies by flow type:
         * 1. For OTP (mobile flow): Use ####, #####, or ###### to generate 4-6 digit verification codes respectively.
         * 2. For Instant Link (desktop flow): Must use exactly #### which will be replaced with the verification URL.
         */
        public Builder smsMessage(Optional<String> smsMessage) {
            Utils.checkNotNull(smsMessage, "smsMessage");
            this.smsMessage = smsMessage;
            return this;
        }
        
        public V3VerifyRequest build() {
            return new V3VerifyRequest(
                clientCustomerId,
                clientRequestId,
                emailAddress,
                finalTargetUrl,
                firstName,
                lastName,
                phoneNumber,
                possessionType,
                smsMessage);
        }
    }
}

