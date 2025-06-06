# V3
(*v3()*)

## Overview

### Available Operations

* [v3TokenRequest](#v3tokenrequest) - Request OAuth Token
* [v3ChallengeRequest](#v3challengerequest) - Submit Challenge
* [v3CompleteRequest](#v3completerequest) - Complete Flow
* [v3StartRequest](#v3startrequest) - Start Flow
* [v3UnifyRequest](#v3unifyrequest) - Initiate Possession Check
* [v3UnifyBindRequest](#v3unifybindrequest) - Bind Prove Key
* [v3UnifyStatusRequest](#v3unifystatusrequest) - Check Status
* [v3ValidateRequest](#v3validaterequest) - Validate Phone Number
* [v3VerifyRequest](#v3verifyrequest) - Initiate Verified Users Session
* [v3VerifyStatusRequest](#v3verifystatusrequest) - Perform Checks for Verified Users Session

## v3TokenRequest

This endpoint allows you to request an OAuth token.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.V3TokenRequest;
import com.prove.proveapi.models.errors.Error401;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3ChallengeRequest

This endpoint allows you to submit challenge information.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3CompleteRequest

This endpoint allows you to verify the user and complete the flow.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
                            .build()))
                    .dob("1981-01")
                    .emailAddresses(List.of(
                        "jdoe@example.com"))
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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3StartRequest

This endpoint allows you to start the solution flow.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3StartRequest req = V3StartRequest.builder()
                .flowType("mobile")
                .allowOTPRetry(true)
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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyRequest

This endpoint allows you to initiate the possession check.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UnifyRequest req = V3UnifyRequest.builder()
                .possessionType("mobile")
                .allowOTPRetry(true)
                .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .finalTargetUrl("https://www.example.com/landing-page")
                .phoneNumber("2001004011")
                .rebind(true)
                .smsMessage("#### is your verification code.")
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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyBindRequest

This endpoint allows you to bind a Prove Key to a phone number of a Unify session and get the possession result.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3UnifyStatusRequest

This endpoint allows you to check the status of a Unify session and get the possession result.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3ValidateRequest

This endpoint allows you to check if the phone number entered/discovered earlier in the flow is validated.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3VerifyRequest

This endpoint allows you to initiate a Verified Users session.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
                .allowOTPRetry(true)
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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3VerifyStatusRequest

This endpoint allows you to perform the necessary checks for a Verified Users session.

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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |