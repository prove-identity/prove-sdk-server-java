/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.sdk.proveapi.models.errors.SDKError;
import com.prove.sdk.proveapi.utils.LazySingletonValue;
import com.prove.sdk.proveapi.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class V3CompleteRequestRequestBuilder {

    private Optional<? extends com.prove.sdk.proveapi.models.components.V3CompleteRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3CompleteRequest sdk;

    public V3CompleteRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3CompleteRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3CompleteRequestRequestBuilder request(com.prove.sdk.proveapi.models.components.V3CompleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3CompleteRequestRequestBuilder request(Optional<? extends com.prove.sdk.proveapi.models.components.V3CompleteRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3CompleteRequestResponse call() throws Exception {

        return sdk.v3CompleteRequest(
            request);
    }
}