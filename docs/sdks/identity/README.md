# Identity
(*identity()*)

## Overview

### Available Operations

* [v3BatchGetIdentities](#v3batchgetidentities) - Batch Get Identities
* [v3EnrollIdentity](#v3enrollidentity) - Enroll Identity
* [v3BatchEnrollIdentities](#v3batchenrollidentities) - Batch Enroll Identities
* [v3DisenrollIdentity](#v3disenrollidentity) - Disenroll Identity
* [v3GetIdentity](#v3getidentity) - Get Identity
* [v3ActivateIdentity](#v3activateidentity) - Activate Identity
* [v3DeactivateIdentity](#v3deactivateidentity) - Deactivate Identity
* [v3GetIdentitiesByPhoneNumber](#v3getidentitiesbyphonenumber) - Get Identities By Phone Number

## v3BatchGetIdentities

Return a list of all identities you have enrolled in Identity Manager.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3BatchGetIdentities" method="get" path="/v3/identity/" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3BatchGetIdentitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3BatchGetIdentitiesResponse res = sdk.identity().v3BatchGetIdentities()
                .call();

        if (res.v3BatchGetIdentitiesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `clientRequestId`                                                                                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field. |
| `limit`                                                                                                                                                                                                                                                                                      | *Optional\<Long>*                                                                                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | The maximum number of identities to return per call. Default value is 100.                                                                                                                                                                                                                   |
| `startKey`                                                                                                                                                                                                                                                                                   | *Optional\<String>*                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | The pagination token for the GET /v3/identity API. Use this to retrieve the next page of results after a previous call to GET /v3/identity. This token is returned as lastKey in the GET /v3/identity API response - pass it in directly as startKey to get the next page of results.        |
| `showInactive`                                                                                                                                                                                                                                                                               | *Optional\<Boolean>*                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | Whether to show identities associated with the current client that are currently marked as inactive. Default value is false.                                                                                                                                                                 |

### Response

**[V3BatchGetIdentitiesResponse](../../models/operations/V3BatchGetIdentitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3EnrollIdentity

Enrolls a single customer for monitoring using their phone number and unique identifier.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3EnrollIdentity" method="post" path="/v3/identity/" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3EnrollIdentityRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3EnrollIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3EnrollIdentityRequest req = V3EnrollIdentityRequest.builder()
                .phoneNumber("2001001695")
                .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .deviceId("bf9ea15d-7dfa-4bb4-a64c-6c26b53472fc")
                .build();

        V3EnrollIdentityResponse res = sdk.identity().v3EnrollIdentity()
                .request(req)
                .call();

        if (res.v3EnrollIdentityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V3EnrollIdentityRequest](../../models/shared/V3EnrollIdentityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V3EnrollIdentityResponse](../../models/operations/V3EnrollIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3BatchEnrollIdentities

Enrolls multiple customers in a single request for efficient bulk operations (up to 100).

### Example Usage

<!-- UsageSnippet language="java" operationID="V3BatchEnrollIdentities" method="post" path="/v3/identity/batch" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3BatchEnrollIdentitiesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3BatchEnrollIdentitiesRequest req = V3BatchEnrollIdentitiesRequest.builder()
                .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                .items(List.of(
                    IdentityItem.builder()
                        .phoneNumber("2001001695")
                        .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                        .deviceId("bf9ea15d-7dfa-4bb4-a64c-6c26b53472fc")
                        .build(),
                    IdentityItem.builder()
                        .phoneNumber("2001001695")
                        .clientCustomerId("e0f78bc2-f748-4eda-9d29-d756844507fc")
                        .deviceId("bf9ea15d-7dfa-4bb4-a64c-6c26b53472fc")
                        .build()))
                .build();

        V3BatchEnrollIdentitiesResponse res = sdk.identity().v3BatchEnrollIdentities()
                .request(req)
                .call();

        if (res.v3BatchEnrollIdentitiesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [V3BatchEnrollIdentitiesRequest](../../models/shared/V3BatchEnrollIdentitiesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[V3BatchEnrollIdentitiesResponse](../../models/operations/V3BatchEnrollIdentitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DisenrollIdentity

Disenrolls an identity from Identity Manager. If you wish to monitor in future, re-enrollment of that identity is required.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DisenrollIdentity" method="delete" path="/v3/identity/{identityId}" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DisenrollIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DisenrollIdentityResponse res = sdk.identity().v3DisenrollIdentity()
                .identityId("<id>")
                .call();

        if (res.v3DisenrollIdentityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `identityId`                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                           | A Prove-generated unique ID for a specific identity.                                                                                                                                                                                                                                         |
| `clientRequestId`                                                                                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field. |

### Response

**[V3DisenrollIdentityResponse](../../models/operations/V3DisenrollIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3GetIdentity

Return details of an identity given the identity ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3GetIdentity" method="get" path="/v3/identity/{identityId}" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3GetIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3GetIdentityResponse res = sdk.identity().v3GetIdentity()
                .identityId("<id>")
                .call();

        if (res.v3GetIdentityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `identityId`                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                           | A unique Prove-generated identifier for the enrolled identity.                                                                                                                                                                                                                               |
| `clientRequestId`                                                                                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field. |

### Response

**[V3GetIdentityResponse](../../models/operations/V3GetIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3ActivateIdentity

Sets an identity as active for monitoring.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3ActivateIdentity" method="post" path="/v3/identity/{identityId}/activate" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3ActivateIdentityRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3ActivateIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3ActivateIdentityResponse res = sdk.identity().v3ActivateIdentity()
                .identityId("<id>")
                .v3ActivateIdentityRequest(V3ActivateIdentityRequest.builder()
                    .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                    .build())
                .call();

        if (res.v3ActivateIdentityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `identityId`                                                                                 | *String*                                                                                     | :heavy_check_mark:                                                                           | A Prove-generated unique ID for a specific identity.                                         |                                                                                              |
| `v3ActivateIdentityRequest`                                                                  | [Optional\<V3ActivateIdentityRequest>](../../models/components/V3ActivateIdentityRequest.md) | :heavy_minus_sign:                                                                           | N/A                                                                                          | {<br/>"clientRequestId": "71010d88-d0e7-4a24-9297-d1be6fefde81"<br/>}                        |

### Response

**[V3ActivateIdentityResponse](../../models/operations/V3ActivateIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DeactivateIdentity

Stops webhook notifications without disenrolling the identity.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DeactivateIdentity" method="post" path="/v3/identity/{identityId}/deactivate" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3IdentityDeactivateRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DeactivateIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DeactivateIdentityResponse res = sdk.identity().v3DeactivateIdentity()
                .identityId("<id>")
                .v3IdentityDeactivateRequest(V3IdentityDeactivateRequest.builder()
                    .clientRequestId("71010d88-d0e7-4a24-9297-d1be6fefde81")
                    .build())
                .call();

        if (res.v3DeactivateIdentityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `identityId`                                                                                     | *String*                                                                                         | :heavy_check_mark:                                                                               | A Prove-generated unique ID for a specific identity.                                             |                                                                                                  |
| `v3IdentityDeactivateRequest`                                                                    | [Optional\<V3IdentityDeactivateRequest>](../../models/components/V3IdentityDeactivateRequest.md) | :heavy_minus_sign:                                                                               | N/A                                                                                              | {<br/>"clientRequestId": "71010d88-d0e7-4a24-9297-d1be6fefde81"<br/>}                            |

### Response

**[V3DeactivateIdentityResponse](../../models/operations/V3DeactivateIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3GetIdentitiesByPhoneNumber

Return list of all identities you have enrolled that are associated with this phone number.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3GetIdentitiesByPhoneNumber" method="get" path="/v3/identity/{mobileNumber}/lookup" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3GetIdentitiesByPhoneNumberResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3GetIdentitiesByPhoneNumberResponse res = sdk.identity().v3GetIdentitiesByPhoneNumber()
                .mobileNumber("<value>")
                .call();

        if (res.v3GetIdentitiesByPhoneNumberResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `mobileNumber`                                                                                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                           | The phone number to find identities for. US phone numbers can be passed in with or without a leading +1. Acceptable characters are: alphanumeric with symbols '+'.                                                                                                                           |
| `clientRequestId`                                                                                                                                                                                                                                                                            | *Optional\<String>*                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                           | A client-generated unique ID for a specific session. This can be used to identify specific requests. The format of this ID is defined by the client - Prove recommends using a GUID, but any format can be accepted. Do not include Personally Identifiable Information (PII) in this field. |

### Response

**[V3GetIdentitiesByPhoneNumberResponse](../../models/operations/V3GetIdentitiesByPhoneNumberResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |