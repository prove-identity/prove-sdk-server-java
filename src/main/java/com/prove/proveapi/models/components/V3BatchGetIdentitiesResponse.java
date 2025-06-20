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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * V3BatchGetIdentitiesResponse
 * 
 * <p>Response body for the V3 Batch Get Identities API.
 */
public class V3BatchGetIdentitiesResponse {

    /**
     * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastKey")
    private Optional<String> lastKey;

    /**
     * The list of identity IDs associated with the client.
     */
    @JsonProperty("results")
    private List<GetBatchIdentityItem> results;

    @JsonCreator
    public V3BatchGetIdentitiesResponse(
            @JsonProperty("lastKey") Optional<String> lastKey,
            @JsonProperty("results") List<GetBatchIdentityItem> results) {
        Utils.checkNotNull(lastKey, "lastKey");
        Utils.checkNotNull(results, "results");
        this.lastKey = lastKey;
        this.results = results;
    }
    
    public V3BatchGetIdentitiesResponse(
            List<GetBatchIdentityItem> results) {
        this(Optional.empty(), results);
    }

    /**
     * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
     */
    @JsonIgnore
    public Optional<String> lastKey() {
        return lastKey;
    }

    /**
     * The list of identity IDs associated with the client.
     */
    @JsonIgnore
    public List<GetBatchIdentityItem> results() {
        return results;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
     */
    public V3BatchGetIdentitiesResponse withLastKey(String lastKey) {
        Utils.checkNotNull(lastKey, "lastKey");
        this.lastKey = Optional.ofNullable(lastKey);
        return this;
    }

    /**
     * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
     */
    public V3BatchGetIdentitiesResponse withLastKey(Optional<String> lastKey) {
        Utils.checkNotNull(lastKey, "lastKey");
        this.lastKey = lastKey;
        return this;
    }

    /**
     * The list of identity IDs associated with the client.
     */
    public V3BatchGetIdentitiesResponse withResults(List<GetBatchIdentityItem> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
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
        V3BatchGetIdentitiesResponse other = (V3BatchGetIdentitiesResponse) o;
        return 
            Objects.deepEquals(this.lastKey, other.lastKey) &&
            Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lastKey,
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3BatchGetIdentitiesResponse.class,
                "lastKey", lastKey,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<String> lastKey = Optional.empty();
 
        private List<GetBatchIdentityItem> results;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
         */
        public Builder lastKey(String lastKey) {
            Utils.checkNotNull(lastKey, "lastKey");
            this.lastKey = Optional.ofNullable(lastKey);
            return this;
        }

        /**
         * A pagination token for callers that have more identities left to return. Pass this back in directly to the Get Batch API with the startKey query parameter to get the next page of results.
         */
        public Builder lastKey(Optional<String> lastKey) {
            Utils.checkNotNull(lastKey, "lastKey");
            this.lastKey = lastKey;
            return this;
        }

        /**
         * The list of identity IDs associated with the client.
         */
        public Builder results(List<GetBatchIdentityItem> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public V3BatchGetIdentitiesResponse build() {
            return new V3BatchGetIdentitiesResponse(
                lastKey,
                results);
        }
    }
}
