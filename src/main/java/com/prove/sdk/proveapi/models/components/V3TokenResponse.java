/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.sdk.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class V3TokenResponse {

    /**
     * AccessToken returns the access token as a string.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * ExpiresIn returns the lifetime of the token in seconds.
     */
    @JsonProperty("expires_in")
    private long expiresIn;

    /**
     * RefreshExpiresIn returns the lifetime of the token in seconds.
     */
    @JsonProperty("refresh_expires_in")
    private long refreshExpiresIn;

    /**
     * RefreshToken returns the refresh token as a string.
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * TokenType returns the type of token.
     */
    @JsonProperty("token_type")
    private String tokenType;

    @JsonCreator
    public V3TokenResponse(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("expires_in") long expiresIn,
            @JsonProperty("refresh_expires_in") long refreshExpiresIn,
            @JsonProperty("refresh_token") String refreshToken,
            @JsonProperty("token_type") String tokenType) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(expiresIn, "expiresIn");
        Utils.checkNotNull(refreshExpiresIn, "refreshExpiresIn");
        Utils.checkNotNull(refreshToken, "refreshToken");
        Utils.checkNotNull(tokenType, "tokenType");
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.refreshExpiresIn = refreshExpiresIn;
        this.refreshToken = refreshToken;
        this.tokenType = tokenType;
    }

    /**
     * AccessToken returns the access token as a string.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    /**
     * ExpiresIn returns the lifetime of the token in seconds.
     */
    @JsonIgnore
    public long expiresIn() {
        return expiresIn;
    }

    /**
     * RefreshExpiresIn returns the lifetime of the token in seconds.
     */
    @JsonIgnore
    public long refreshExpiresIn() {
        return refreshExpiresIn;
    }

    /**
     * RefreshToken returns the refresh token as a string.
     */
    @JsonIgnore
    public String refreshToken() {
        return refreshToken;
    }

    /**
     * TokenType returns the type of token.
     */
    @JsonIgnore
    public String tokenType() {
        return tokenType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * AccessToken returns the access token as a string.
     */
    public V3TokenResponse withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * ExpiresIn returns the lifetime of the token in seconds.
     */
    public V3TokenResponse withExpiresIn(long expiresIn) {
        Utils.checkNotNull(expiresIn, "expiresIn");
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * RefreshExpiresIn returns the lifetime of the token in seconds.
     */
    public V3TokenResponse withRefreshExpiresIn(long refreshExpiresIn) {
        Utils.checkNotNull(refreshExpiresIn, "refreshExpiresIn");
        this.refreshExpiresIn = refreshExpiresIn;
        return this;
    }

    /**
     * RefreshToken returns the refresh token as a string.
     */
    public V3TokenResponse withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * TokenType returns the type of token.
     */
    public V3TokenResponse withTokenType(String tokenType) {
        Utils.checkNotNull(tokenType, "tokenType");
        this.tokenType = tokenType;
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
        V3TokenResponse other = (V3TokenResponse) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.expiresIn, other.expiresIn) &&
            java.util.Objects.deepEquals(this.refreshExpiresIn, other.refreshExpiresIn) &&
            java.util.Objects.deepEquals(this.refreshToken, other.refreshToken) &&
            java.util.Objects.deepEquals(this.tokenType, other.tokenType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            expiresIn,
            refreshExpiresIn,
            refreshToken,
            tokenType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3TokenResponse.class,
                "accessToken", accessToken,
                "expiresIn", expiresIn,
                "refreshExpiresIn", refreshExpiresIn,
                "refreshToken", refreshToken,
                "tokenType", tokenType);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Long expiresIn;
 
        private Long refreshExpiresIn;
 
        private String refreshToken;
 
        private String tokenType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AccessToken returns the access token as a string.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * ExpiresIn returns the lifetime of the token in seconds.
         */
        public Builder expiresIn(long expiresIn) {
            Utils.checkNotNull(expiresIn, "expiresIn");
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * RefreshExpiresIn returns the lifetime of the token in seconds.
         */
        public Builder refreshExpiresIn(long refreshExpiresIn) {
            Utils.checkNotNull(refreshExpiresIn, "refreshExpiresIn");
            this.refreshExpiresIn = refreshExpiresIn;
            return this;
        }

        /**
         * RefreshToken returns the refresh token as a string.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * TokenType returns the type of token.
         */
        public Builder tokenType(String tokenType) {
            Utils.checkNotNull(tokenType, "tokenType");
            this.tokenType = tokenType;
            return this;
        }
        
        public V3TokenResponse build() {
            return new V3TokenResponse(
                accessToken,
                expiresIn,
                refreshExpiresIn,
                refreshToken,
                tokenType);
        }
    }
}
