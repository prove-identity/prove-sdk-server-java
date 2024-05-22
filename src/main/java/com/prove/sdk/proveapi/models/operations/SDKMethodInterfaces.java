/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi.models.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallV3ChallengeRequest {
        com.prove.sdk.proveapi.models.operations.V3ChallengeRequestResponse v3ChallengeRequest(
            Optional<? extends com.prove.sdk.proveapi.models.components.V3ChallengeRequest> request) throws Exception;
    }


    public interface MethodCallV3CompleteRequest {
        com.prove.sdk.proveapi.models.operations.V3CompleteRequestResponse v3CompleteRequest(
            Optional<? extends com.prove.sdk.proveapi.models.components.V3CompleteRequest> request) throws Exception;
    }


    public interface MethodCallV3StartRequest {
        com.prove.sdk.proveapi.models.operations.V3StartRequestResponse v3StartRequest(
            Optional<? extends com.prove.sdk.proveapi.models.components.V3StartRequest> request) throws Exception;
    }


    public interface MethodCallV3ValidateRequest {
        com.prove.sdk.proveapi.models.operations.V3ValidateRequestResponse v3ValidateRequest(
            Optional<? extends com.prove.sdk.proveapi.models.components.V3ValidateRequest> request) throws Exception;
    }

}