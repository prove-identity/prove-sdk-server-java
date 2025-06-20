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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * V3BatchEnrollIdentitiesRequest
 * 
 * <p>Request body for the V3 Batch Enroll Identities API.
 */
public class V3BatchEnrollIdentitiesRequest {

    /**
     * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientRequestId")
    private Optional<String> clientRequestId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends List<IdentityItem>> items;

    @JsonCreator
    public V3BatchEnrollIdentitiesRequest(
            @JsonProperty("clientRequestId") Optional<String> clientRequestId,
            @JsonProperty("items") Optional<? extends List<IdentityItem>> items) {
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        Utils.checkNotNull(items, "items");
        this.clientRequestId = clientRequestId;
        this.items = items;
    }
    
    public V3BatchEnrollIdentitiesRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
     */
    @JsonIgnore
    public Optional<String> clientRequestId() {
        return clientRequestId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<IdentityItem>> items() {
        return (Optional<List<IdentityItem>>) items;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3BatchEnrollIdentitiesRequest withClientRequestId(String clientRequestId) {
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        this.clientRequestId = Optional.ofNullable(clientRequestId);
        return this;
    }

    /**
     * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
     */
    public V3BatchEnrollIdentitiesRequest withClientRequestId(Optional<String> clientRequestId) {
        Utils.checkNotNull(clientRequestId, "clientRequestId");
        this.clientRequestId = clientRequestId;
        return this;
    }

    public V3BatchEnrollIdentitiesRequest withItems(List<IdentityItem> items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }

    public V3BatchEnrollIdentitiesRequest withItems(Optional<? extends List<IdentityItem>> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        V3BatchEnrollIdentitiesRequest other = (V3BatchEnrollIdentitiesRequest) o;
        return 
            Objects.deepEquals(this.clientRequestId, other.clientRequestId) &&
            Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientRequestId,
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3BatchEnrollIdentitiesRequest.class,
                "clientRequestId", clientRequestId,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<String> clientRequestId = Optional.empty();
 
        private Optional<? extends List<IdentityItem>> items = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientRequestId(String clientRequestId) {
            Utils.checkNotNull(clientRequestId, "clientRequestId");
            this.clientRequestId = Optional.ofNullable(clientRequestId);
            return this;
        }

        /**
         * A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field.
         */
        public Builder clientRequestId(Optional<String> clientRequestId) {
            Utils.checkNotNull(clientRequestId, "clientRequestId");
            this.clientRequestId = clientRequestId;
            return this;
        }

        public Builder items(List<IdentityItem> items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }

        public Builder items(Optional<? extends List<IdentityItem>> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public V3BatchEnrollIdentitiesRequest build() {
            return new V3BatchEnrollIdentitiesRequest(
                clientRequestId,
                items);
        }
    }
}
