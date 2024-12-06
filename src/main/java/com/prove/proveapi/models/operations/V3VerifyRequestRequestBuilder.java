/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.prove.proveapi.models.operations;

import com.prove.proveapi.models.components.V3VerifyRequest;
import com.prove.proveapi.utils.Utils;
import java.util.Optional;

public class V3VerifyRequestRequestBuilder {

    private Optional<? extends V3VerifyRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3VerifyRequest sdk;

    public V3VerifyRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3VerifyRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3VerifyRequestRequestBuilder request(V3VerifyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3VerifyRequestRequestBuilder request(Optional<? extends V3VerifyRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3VerifyRequestResponse call() throws Exception {

        return sdk.v3VerifyRequest(
            request);
    }
}