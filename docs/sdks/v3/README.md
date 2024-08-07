# V3
(*v3()*)

### Available Operations

* [v3TokenRequest](#v3tokenrequest) - Request OAuth token.
* [v3ChallengeRequest](#v3challengerequest) - Submit challenge.
* [v3CompleteRequest](#v3completerequest) - Complete flow.
* [v3StartRequest](#v3startrequest) - Start flow.
* [v3ValidateRequest](#v3validaterequest) - Validate phone number.

## v3TokenRequest

Send this request to request the OAuth token.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.operations.*;
import com.prove.proveapi.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.prove.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [com.prove.proveapi.models.components.V3TokenRequest](../../models/shared/V3TokenRequest.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[com.prove.proveapi.models.operations.V3TokenRequestResponse](../../models/operations/V3TokenRequestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## v3ChallengeRequest

Send this request to submit challenge information. Either a DOB or last 4 of SSN needs to be submitted if neither was submitted to the /start endpoint (challenge fields submitted to this endpoint will overwrite the /start endpoint fields submitted). It will return a correlation ID, user information, and the next step to call in the flow. This capability is only available in Prove Pre-Fill®, it's not available in Prove Identity®. You'll notice that when using Prove Identity®, if /validate is successful, it will then return `v3-complete` as one of the keys in the `Next` field map instead of `v3-challenge`.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.operations.*;
import com.prove.proveapi.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .ssn("1234")
                .build();

            V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

            if (res.v3ChallengeResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.prove.proveapi.models.components.V3ChallengeRequest](../../models/shared/V3ChallengeRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[com.prove.proveapi.models.operations.V3ChallengeRequestResponse](../../models/operations/V3ChallengeRequestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## v3CompleteRequest

Send this request to verify the user and complete the flow. It will return a correlation ID, user information, and the next step to call in the flow. At least a first name, last name, or SSN is required to verify an individual.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.operations.*;
import com.prove.proveapi.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V3CompleteRequest req = V3CompleteRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .individual(V3CompleteIndividualRequest.builder()
                        .addresses(java.util.List.of(
                            V3CompleteAddressEntryRequest.builder()
                                .address("39 South Trail")
                                .city("San Antonio")
                                .extendedAddress("39 South Trail")
                                .postalCode("78285")
                                .region("TX")
                                .build(),
                            V3CompleteAddressEntryRequest.builder()
                                .address("39 South Trail")
                                .city("San Antonio")
                                .extendedAddress("39 South Trail")
                                .postalCode("78285")
                                .region("TX")
                                .build()))
                        .dob("2024-05-02T00:00:00Z")
                        .emailAddresses(java.util.List.of(
                            "jdoe@example.com",
                            "dsmith@example.com"))
                        .firstName("Tod")
                        .last4SSN("1234")
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
        } catch (com.prove.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [com.prove.proveapi.models.components.V3CompleteRequest](../../models/shared/V3CompleteRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[com.prove.proveapi.models.operations.V3CompleteRequestResponse](../../models/operations/V3CompleteRequestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## v3StartRequest

Send this request to start a Prove flow. It will return a correlation ID and an authToken for the client SDK.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.operations.*;
import com.prove.proveapi.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V3StartRequest req = V3StartRequest.builder()
                .flowType("mobile")
                .dob("2024-05-02T00:00:00Z")
                .emailAddress("jdoe@example.com")
                .finalTargetUrl("https://www.example.com/landing-page")
                .ipAddress("10.0.0.1")
                .phoneNumber("2001001686")
                .ssn("1234")
                .build();

            V3StartRequestResponse res = sdk.v3().v3StartRequest()
                .request(req)
                .call();

            if (res.v3StartResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [com.prove.proveapi.models.components.V3StartRequest](../../models/shared/V3StartRequest.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[com.prove.proveapi.models.operations.V3StartRequestResponse](../../models/operations/V3StartRequestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## v3ValidateRequest

Send this request to check the phone number entered/discovered earlier in the flow is validated. It will return a correlation ID and the next step.

### Example Usage

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.operations.*;
import com.prove.proveapi.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.prove.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [com.prove.proveapi.models.components.V3ValidateRequest](../../models/shared/V3ValidateRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[com.prove.proveapi.models.operations.V3ValidateRequestResponse](../../models/operations/V3ValidateRequestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
