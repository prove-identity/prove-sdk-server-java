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
import com.prove.sdk.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V3TokenRequest {

    /**
     * ClientID is the optional client ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    private Optional<? extends String> clientId;

    /**
     * ClientSecret is the client secret ID provided to the customer during onboarding.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<? extends String> clientSecret;

    /**
     * GrantType only allows option: `password`.
     */
    @JsonProperty("grant_type")
    private String grantType;

    /**
     * Password is the secret ID provided to the customer during onboarding.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * Username is the ID provided to the customer during onboarding.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<? extends String> username;

    @JsonCreator
    public V3TokenRequest(
            @JsonProperty("client_id") Optional<? extends String> clientId,
            @JsonProperty("client_secret") Optional<? extends String> clientSecret,
            @JsonProperty("grant_type") String grantType,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("username") Optional<? extends String> username) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(grantType, "grantType");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.grantType = grantType;
        this.password = password;
        this.username = username;
    }
    
    public V3TokenRequest(
            String grantType) {
        this(Optional.empty(), Optional.empty(), grantType, Optional.empty(), Optional.empty());
    }

    /**
     * ClientID is the optional client ID.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientId() {
        return (Optional<String>) clientId;
    }

    /**
     * ClientSecret is the client secret ID provided to the customer during onboarding.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> clientSecret() {
        return (Optional<String>) clientSecret;
    }

    /**
     * GrantType only allows option: `password`.
     */
    @JsonIgnore
    public String grantType() {
        return grantType;
    }

    /**
     * Password is the secret ID provided to the customer during onboarding.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> password() {
        return (Optional<String>) password;
    }

    /**
     * Username is the ID provided to the customer during onboarding.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> username() {
        return (Optional<String>) username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ClientID is the optional client ID.
     */
    public V3TokenRequest withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * ClientID is the optional client ID.
     */
    public V3TokenRequest withClientId(Optional<? extends String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * ClientSecret is the client secret ID provided to the customer during onboarding.
     */
    public V3TokenRequest withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * ClientSecret is the client secret ID provided to the customer during onboarding.
     */
    public V3TokenRequest withClientSecret(Optional<? extends String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * GrantType only allows option: `password`.
     */
    public V3TokenRequest withGrantType(String grantType) {
        Utils.checkNotNull(grantType, "grantType");
        this.grantType = grantType;
        return this;
    }

    /**
     * Password is the secret ID provided to the customer during onboarding.
     */
    public V3TokenRequest withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password is the secret ID provided to the customer during onboarding.
     */
    public V3TokenRequest withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Username is the ID provided to the customer during onboarding.
     */
    public V3TokenRequest withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * Username is the ID provided to the customer during onboarding.
     */
    public V3TokenRequest withUsername(Optional<? extends String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        V3TokenRequest other = (V3TokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.grantType, other.grantType) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientSecret,
            grantType,
            password,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3TokenRequest.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "grantType", grantType,
                "password", password,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> clientId = Optional.empty();
 
        private Optional<? extends String> clientSecret = Optional.empty();
 
        private String grantType;
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends String> username = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ClientID is the optional client ID.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * ClientID is the optional client ID.
         */
        public Builder clientId(Optional<? extends String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientSecret is the client secret ID provided to the customer during onboarding.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * ClientSecret is the client secret ID provided to the customer during onboarding.
         */
        public Builder clientSecret(Optional<? extends String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * GrantType only allows option: `password`.
         */
        public Builder grantType(String grantType) {
            Utils.checkNotNull(grantType, "grantType");
            this.grantType = grantType;
            return this;
        }

        /**
         * Password is the secret ID provided to the customer during onboarding.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password is the secret ID provided to the customer during onboarding.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Username is the ID provided to the customer during onboarding.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        /**
         * Username is the ID provided to the customer during onboarding.
         */
        public Builder username(Optional<? extends String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public V3TokenRequest build() {
            return new V3TokenRequest(
                clientId,
                clientSecret,
                grantType,
                password,
                username);
        }
    }
}

