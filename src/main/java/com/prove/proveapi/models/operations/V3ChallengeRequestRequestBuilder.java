/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi.models.operations;

import com.prove.proveapi.models.components.V3ChallengeRequest;
import com.prove.proveapi.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class V3ChallengeRequestRequestBuilder {

    private Optional<? extends V3ChallengeRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3ChallengeRequest sdk;

    public V3ChallengeRequestRequestBuilder(SDKMethodInterfaces.MethodCallV3ChallengeRequest sdk) {
        this.sdk = sdk;
    }
                
    public V3ChallengeRequestRequestBuilder request(V3ChallengeRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3ChallengeRequestRequestBuilder request(Optional<? extends V3ChallengeRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ChallengeRequestResponse call() throws Exception {

        return sdk.v3ChallengeRequest(
            request);
    }
}
