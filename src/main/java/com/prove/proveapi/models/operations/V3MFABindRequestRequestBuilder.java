/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.prove.proveapi.models.operations;

import com.prove.proveapi.models.components.V3MFABindRequest;
import com.prove.proveapi.utils.Utils;
import java.util.Optional;

public class V3MFABindRequestRequestBuilder {

    private Optional<? extends V3MFABindRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3MFABindRequest sdk;

    public V3MFABindRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3MFABindRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3MFABindRequestRequestBuilder request(V3MFABindRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3MFABindRequestRequestBuilder request(Optional<? extends V3MFABindRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3MFABindRequestResponse call() throws Exception {

        return sdk.v3MFABindRequest(
            request);
    }
}
