# Auth

## Overview

### Available Operations

* [authContinueRequest](#authcontinuerequest) - AuthContinue /v1/server/auth/continue
* [authFinishRequest](#authfinishrequest) - AuthFinish /v1/server/auth/finish
* [authStartRequest](#authstartrequest) - AuthStart /v1/server/auth/start

## authContinueRequest

If the initial Prove Auth authenticators fail, the Force Bind authenticator can be used which permits using another
authentication method to verify a mobile number (like Prove Instant Link™). Once the mobile number is verified, send
this AuthContinue request.

Production URL: https://oapi.prove-auth.proveapis.com/v1/server/auth/continue

### Example Usage

<!-- UsageSnippet language="java" operationID="AuthContinueRequest" method="post" path="/v1/server/auth/continue" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.errors.Error400;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.AuthContinueRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        AuthContinueRequest req = AuthContinueRequest.builder()
                .authId("713189b8-5555-4b08-83ba-75d08780aebd")
                .requestId("eba12f3a-5555-47bc-b85d-21c0cbc4b973")
                .subjects(AuthContinueRequestSubjects.builder()
                    .mobile(AuthContinueRequestSubjectMobile.builder()
                        .claim(AuthContinueRequestSubjectMobileClaim.builder()
                            .mobileNumber("12065550100")
                            .build())
                        .build())
                    .build())
                .build();

        AuthContinueRequestResponse res = sdk.auth().authContinueRequest()
                .request(req)
                .call();

        if (res.authContinueResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AuthContinueRequest](../../models/shared/AuthContinueRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AuthContinueRequestResponse](../../models/operations/AuthContinueRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## authFinishRequest

To complete the auth flow and get the authentication result, send this AuthFinish request.

Production URL: https://oapi.prove-auth.proveapis.com/v1/server/auth/finish

### Example Usage

<!-- UsageSnippet language="java" operationID="AuthFinishRequest" method="post" path="/v1/server/auth/finish" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.AuthFinishRequest;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.Error400;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.AuthFinishRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        AuthFinishRequest req = AuthFinishRequest.builder()
                .authId("eba12f3a-5555-47bc-b85d-21c0cbc4b973")
                .build();

        AuthFinishRequestResponse res = sdk.auth().authFinishRequest()
                .request(req)
                .call();

        if (res.authFinishResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [AuthFinishRequest](../../models/shared/AuthFinishRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[AuthFinishRequestResponse](../../models/operations/AuthFinishRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## authStartRequest

To start an auth flow, send this AuthStart request to control how Prove Auth will authenticate the end users and
their devices. The expected authenticators should be included in the body parameters. There are many supported
scenarios to use Prove Auth so each of the request types are explained in the "Server Integration Guide".

Production URL: https://oapi.prove-auth.proveapis.com/v1/server/auth/start

### Example Usage

<!-- UsageSnippet language="java" operationID="AuthStartRequest" method="post" path="/v1/server/auth/start" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.errors.Error400;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.AuthStartRequestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error400, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        AuthStartRequest req = AuthStartRequest.builder()
                .requestId("eba12f3a-5555-47bc-b85d-21c0cbc4b973")
                .subjects(AuthStartRequestSubjects.builder()
                    .card(AuthStartRequestSubjectCard.builder()
                        .authenticators(AuthStartRequestSubjectCardAuthenticators.builder()
                            .airKey(AuthStartRequestSubjectCardAuthenticatorAirKey.builder()
                                .claim(AuthStartRequestSubjectCardAuthenticatorAirKeyClaim.builder()
                                    .puids(List.of(
                                        "puids",
                                        "puids"))
                                    .build())
                                .testMode("testMode")
                                .build())
                            .build())
                        .build())
                    .device(AuthStartRequestSubjectDevice.builder()
                        .authenticators(AuthStartRequestSubjectDeviceAuthenticators.builder()
                            .passive(AuthStartRequestSubjectDeviceAuthenticatorPassive.builder()
                                .allowPasscodeFallback(true)
                                .userVerificationLevel("userVerificationLevel")
                                .build())
                            .build())
                        .claim(AuthStartRequestSubjectDeviceClaim.builder()
                            .deviceId("deviceId")
                            .build())
                        .build())
                    .mobile(AuthStartRequestSubjectMobile.builder()
                        .authenticators(AuthStartRequestSubjectMobileAuthenticators.builder()
                            .instant(AuthStartRequestSubjectMobileAuthenticatorInstant.builder()
                                .consent(AuthStartRequestInstantAuthConsent.builder()
                                    .status("optedIn")
                                    .collectedTimestamp("2022-02-17T00:00:00Z")
                                    .description("Customer Application Name")
                                    .transactionId("eba12f3a-5555-47bc-b85d-21c0cbc4b973")
                                    .build())
                                .testMode("testMode")
                                .build())
                            .instantlink(AuthStartRequestSubjectMobileAuthenticatorInstantLink.builder()
                                .finalTargetUrl("https://example.com/finishpage")
                                .messageText("Please click the link to authenticate your mobile number: ####")
                                .allowMobileNumberRePrompt(true)
                                .sourceIp("123...")
                                .subscriptionCustomerId("123")
                                .testMode("testMode")
                                .build())
                            .otp(AuthStartRequestSubjectMobileAuthenticatorOTP.builder()
                                .messageText("Your pin is: ####")
                                .allowMobileNumberRePrompt(true)
                                .allowOtpRetry(true)
                                .testMode("testMode")
                                .build())
                            .passive(AuthStartRequestSubjectMobileAuthenticatorPassive.builder()
                                .cacheResult(true)
                                .localDomain(true)
                                .maxAge(7776000L)
                                .testMode("testMode")
                                .build())
                            .universal(AuthStartRequestSubjectMobileAuthenticatorUniversal.builder()
                                .finalTargetUrl("https://example.com/finishpage")
                                .testMode("testMode")
                                .build())
                            .build())
                        .claim(AuthStartRequestSubjectMobileClaim.builder()
                            .mobileNumber("12065550100")
                            .build())
                        .build())
                    .user(AuthStartRequestSubjectUser.builder()
                        .authenticators(AuthStartRequestSubjectUserAuthenticators.builder()
                            .docv(Docv.builder()
                                .build())
                            .passive(AuthStartRequestSubjectUserAuthenticatorPassive.builder()
                                .userVerificationLevel("userVerificationLevel")
                                .build())
                            .ppb(Ppb.builder()
                                .build())
                            .present(Present.builder()
                                .build())
                            .build())
                        .claim(AuthStartRequestSubjectUserClaim.builder()
                            .userId("eba12f3a-5555-47bc-b85d-21c0cbc4b973")
                            .provided(true)
                            .build())
                        .build())
                    .build())
                .callbackUrl("https://example.com/webhook")
                .delivery(AuthStartRequestDelivery.builder()
                    .push(AuthStartRequestDeliveryPush.builder()
                        .notification(AuthStartRequestDeliveryPushNotification.builder()
                            .body("Do you want to allow login from this device?")
                            .title("Confirm Login")
                            .confirmBtn("Confirm")
                            .denyBtn("Deny")
                            .originatingDevice("iPhone12")
                            .originatingIp("198.51.100.10")
                            .build())
                        .build())
                    .scan(AuthStartRequestDeliveryScan.builder()
                        .notification(AuthStartRequestDeliveryScanNotification.builder()
                            .body("Please confirm you are trying to sign in...")
                            .title("Confirm Sign In")
                            .confirmBtn("Confirm")
                            .denyBtn("Deny")
                            .originatingDevice("Google Chrome on Windows")
                            .originatingIp("198.51.100.10")
                            .build())
                        .build())
                    .build())
                .build();

        AuthStartRequestResponse res = sdk.auth().authStartRequest()
                .request(req)
                .call();

        if (res.authStartResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [AuthStartRequest](../../models/shared/AuthStartRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[AuthStartRequestResponse](../../models/operations/AuthStartRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |