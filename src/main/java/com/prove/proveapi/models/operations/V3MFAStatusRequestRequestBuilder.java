/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.prove.proveapi.models.operations;

import com.prove.proveapi.models.components.V3MFAStatusRequest;
import com.prove.proveapi.utils.Utils;
import java.util.Optional;

public class V3MFAStatusRequestRequestBuilder {

    private Optional<? extends V3MFAStatusRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3MFAStatusRequest sdk;

    public V3MFAStatusRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3MFAStatusRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3MFAStatusRequestRequestBuilder request(V3MFAStatusRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3MFAStatusRequestRequestBuilder request(Optional<? extends V3MFAStatusRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3MFAStatusRequestResponse call() throws Exception {

        return sdk.v3MFAStatusRequest(
            request);
    }
}
