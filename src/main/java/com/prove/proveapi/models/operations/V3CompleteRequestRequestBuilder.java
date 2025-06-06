/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.operations;

import com.prove.proveapi.models.components.V3CompleteRequest;
import com.prove.proveapi.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class V3CompleteRequestRequestBuilder {

    private Optional<? extends V3CompleteRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3CompleteRequest sdk;

    public V3CompleteRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3CompleteRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3CompleteRequestRequestBuilder request(V3CompleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3CompleteRequestRequestBuilder request(Optional<? extends V3CompleteRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3CompleteRequestResponse call() throws Exception {

        return sdk.v3CompleteRequest(
            request);
    }
}
