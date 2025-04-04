# V3
(*v3()*)

## Overview

### Available Operations

* [v3TokenRequest](#v3tokenrequest) - Request OAuth token.
* [v3ChallengeRequest](#v3challengerequest) - Submit challenge.
* [v3CompleteRequest](#v3completerequest) - Complete flow.
* [v3StartRequest](#v3startrequest) - Start flow.
* [v3UnifyRequest](#v3unifyrequest) - Initiate possession check.
* [v3UnifyBindRequest](#v3unifybindrequest) - Check status of Unify session.
* [v3UnifyStatusRequest](#v3unifystatusrequest) - Check status of Unify session.
* [v3ValidateRequest](#v3validaterequest) - Validate phone number.
* [v3VerifyRequest](#v3verifyrequest) - Initiate verified users session.
* [v3VerifyStatusRequest](#v3verifystatusrequest) - Perform checks for verified users session.

## v3TokenRequest

Send this request to request the OAuth token.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.V3TokenRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error, Exception {

        Proveapi sdk = Proveapi.builder()
            .build();

        V3TokenRequest req = V3TokenRequest.builder()
                .clientId("customer_id")
                .clientSecret("secret")
                .grantType("client_credentials")
                .build();

        V3TokenRequestResponse res = sdk.v3().v3TokenRequest()
                .request(req)
                .call();

        if (res.v3TokenResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [V3TokenRequest](../../models/shared/V3TokenRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[V3TokenRequestResponse](../../models/operations/V3TokenRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3ChallengeRequest

Send this request to submit challenge information. Either a DOB or last 4 of SSN needs to be submitted if neither was submitted to the /start endpoint (challenge fields submitted to this endpoint will overwrite the /start endpoint fields submitted). It will return a correlation ID, user information, and the next step to call in the flow. This capability is only available in Pre-Fill®, it's not available in Prove Identity®. You'll notice that when using Prove Identity®, if /validate is successful, it will then return `v3-complete` as one of the keys in the `Next` field map instead of `v3-challenge`.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3ChallengeRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3ChallengeRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("1981-01")
                .ssn("0596")
                .build();

        V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

        if (res.v3ChallengeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [V3ChallengeRequest](../../models/shared/V3ChallengeRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[V3ChallengeRequestResponse](../../models/operations/V3ChallengeRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3CompleteRequest

Send this request to verify the user and complete the flow. It will return a correlation ID, user information, and the next step to call in the flow. There is a validation check that requires at least first + last name or SSN passed in, else an HTTP 400 is returned. Additionally, specific to the Pre-Fill® or Prove Identity® with KYC use case, you need to pass in first name, last name, DOB and SSN (or address) to ensure you receive back the KYC elements and correct CIP values.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3CompleteRequestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3CompleteRequest req = V3CompleteRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .individual(V3CompleteIndividualRequest.builder()
                    .addresses(List.of(
                        V3CompleteAddressEntryRequest.builder()
                            .address("39 South Trail")
                            .city("San Antonio")
                            .extendedAddress("Apt 23")
                            .postalCode("78285")
                            .region("TX")
                            .build(),
                        V3CompleteAddressEntryRequest.builder()
                            .address("4861 Jay Junction")
                            .city("Boston")
                            .extendedAddress("Apt 78")
                            .postalCode("02208")
                            .region("MS")
                            .build()))
                    .dob("1981-01")
                    .emailAddresses(List.of(
                        "jdoe@example.com",
                        "dsmith@example.com"))
                    .firstName("Tod")
                    .lastName("Weedall")
                    .ssn("265228370")
                    .build())
                .build();

        V3CompleteRequestResponse res = sdk.v3().v3CompleteRequest()
                .request(req)
                .call();

        if (res.v3CompleteResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [V3CompleteRequest](../../models/shared/V3CompleteRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[V3CompleteRequestResponse](../../models/operations/V3CompleteRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3StartRequest

Send this request to start a Prove flow. It will return a correlation ID and an authToken for the client SDK.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3StartRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3StartRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3StartRequest req = V3StartRequest.builder()
                .flowType("mobile")
                .dob("1981-01")
                .emailAddress("mpinsonm@dyndns.org")
                .finalTargetUrl("https://www.example.com/landing-page")
                .ipAddress("10.0.0.1")
                .phoneNumber("2001001695")
                .smsMessage("#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone.")
                .ssn("0596")
                .build();

        V3StartRequestResponse res = sdk.v3().v3StartRequest()
                .request(req)
                .call();

        if (res.v3StartResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [V3StartRequest](../../models/shared/V3StartRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[V3StartRequestResponse](../../models/operations/V3StartRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyRequest

Send this request to initiate a possession check. It will return a correlation ID
and authToken for the client SDK.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3UnifyRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3UnifyRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UnifyRequest req = V3UnifyRequest.builder()
                .possessionType("mobile")
                .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .finalTargetUrl("https://www.example.com/landing-page")
                .phoneNumber("2001004011")
                .smsMessage("#### is your verification code")
                .build();

        V3UnifyRequestResponse res = sdk.v3().v3UnifyRequest()
                .request(req)
                .call();

        if (res.v3UnifyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [V3UnifyRequest](../../models/shared/V3UnifyRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[V3UnifyRequestResponse](../../models/operations/V3UnifyRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyBindRequest

Send this request to bind Prove Key to a phone nuymber of an Unify session and get the possession result.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3UnifyBindRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3UnifyBindRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UnifyBindRequest req = V3UnifyBindRequest.builder()
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .phoneNumber("2001004011")
                .build();

        V3UnifyBindRequestResponse res = sdk.v3().v3UnifyBindRequest()
                .request(req)
                .call();

        if (res.v3UnifyBindResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [V3UnifyBindRequest](../../models/shared/V3UnifyBindRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[V3UnifyBindRequestResponse](../../models/operations/V3UnifyBindRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyStatusRequest

Send this request to check the status of an Unify session and get the possession result.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3UnifyStatusRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3UnifyStatusRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UnifyStatusRequest req = V3UnifyStatusRequest.builder()
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .phoneNumber("2001004011")
                .build();

        V3UnifyStatusRequestResponse res = sdk.v3().v3UnifyStatusRequest()
                .request(req)
                .call();

        if (res.v3UnifyStatusResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V3UnifyStatusRequest](../../models/shared/V3UnifyStatusRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V3UnifyStatusRequestResponse](../../models/operations/V3UnifyStatusRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3ValidateRequest

Send this request to check the phone number entered/discovered earlier in the flow is validated. It will return a correlation ID and the next step.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3ValidateRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3ValidateRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ValidateRequest req = V3ValidateRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .build();

        V3ValidateRequestResponse res = sdk.v3().v3ValidateRequest()
                .request(req)
                .call();

        if (res.v3ValidateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [V3ValidateRequest](../../models/shared/V3ValidateRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[V3ValidateRequestResponse](../../models/operations/V3ValidateRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3VerifyRequest

Send this request to initiate a Verified Users session. It will return a correlation ID, authToken for the client SDK, and the results of the possession and verify checks (usually pending from this API).

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3VerifyRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3VerifyRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3VerifyRequest req = V3VerifyRequest.builder()
                .firstName("Sheilakathryn")
                .lastName("Butrimovich")
                .phoneNumber("2001004011")
                .possessionType("mobile")
                .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .emailAddress("sbutrimovichb@who.int")
                .finalTargetUrl("https://www.example.com/landing-page")
                .smsMessage("#### is your temporary code to continue your application. Caution: for your security, don't share this code with anyone.")
                .build();

        V3VerifyRequestResponse res = sdk.v3().v3VerifyRequest()
                .request(req)
                .call();

        if (res.v3VerifyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [V3VerifyRequest](../../models/shared/V3VerifyRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[V3VerifyRequestResponse](../../models/operations/V3VerifyRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3VerifyStatusRequest

Send this request to perform the necessary checks for a Verified Users session. It will return the results of the possession and verify checks, as well as the overall success.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3VerifyStatusRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3VerifyStatusRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3VerifyStatusRequest req = V3VerifyStatusRequest.builder()
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .build();

        V3VerifyStatusRequestResponse res = sdk.v3().v3VerifyStatusRequest()
                .request(req)
                .call();

        if (res.v3VerifyStatusResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V3VerifyStatusRequest](../../models/shared/V3VerifyStatusRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V3VerifyStatusRequestResponse](../../models/operations/V3VerifyStatusRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error400 | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |