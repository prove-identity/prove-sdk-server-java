# prove-sdk-server-java
Java Server SDK for Prove APIs - Customer Access

<!-- No SDK Installation -->
<!-- No SDK Example Usage -->
<!-- No SDK Available Operations -->
<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400,500                | application/json       |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

```java
package hello.world;

import com.prove.sdk.proveapi.Proveapi;
import com.prove.sdk.proveapi.models.components.*;
import com.prove.sdk.proveapi.models.components.Security;
import com.prove.sdk.proveapi.models.operations.*;
import com.prove.sdk.proveapi.utils.EventStream;
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
                .auth("<YOUR_AUTH_HERE>")
                .build();

            V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .last4SSN("1234")
                .build();

            V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

            if (res.v3ChallengeResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.sdk.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.sdk.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally by passing a server name to the `server` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name | Server | Variables |
| ----- | ------ | --------- |
| `uat-us` | `https://platform.uat.proveapis.com` | None |
| `prod-us` | `https://platform.proveapis.com` | None |

#### Example

```java
package hello.world;

import com.prove.sdk.proveapi.Proveapi;
import com.prove.sdk.proveapi.models.components.*;
import com.prove.sdk.proveapi.models.components.Security;
import com.prove.sdk.proveapi.models.operations.*;
import com.prove.sdk.proveapi.utils.EventStream;
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
                .server(Proveapi.AvailableServers.PROD_US)
                .auth("<YOUR_AUTH_HERE>")
                .build();

            V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .last4SSN("1234")
                .build();

            V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

            if (res.v3ChallengeResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.sdk.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.sdk.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.prove.sdk.proveapi.Proveapi;
import com.prove.sdk.proveapi.models.components.*;
import com.prove.sdk.proveapi.models.components.Security;
import com.prove.sdk.proveapi.models.operations.*;
import com.prove.sdk.proveapi.utils.EventStream;
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
                .serverURL("https://platform.uat.proveapis.com")
                .auth("<YOUR_AUTH_HERE>")
                .build();

            V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .last4SSN("1234")
                .build();

            V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

            if (res.v3ChallengeResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.sdk.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.sdk.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `auth`       | oauth2       | OAuth2 token |

To authenticate with the API the `auth` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.prove.sdk.proveapi.Proveapi;
import com.prove.sdk.proveapi.models.components.*;
import com.prove.sdk.proveapi.models.components.Security;
import com.prove.sdk.proveapi.models.operations.*;
import com.prove.sdk.proveapi.utils.EventStream;
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
                .auth("<YOUR_AUTH_HERE>")
                .build();

            V3ChallengeRequest req = V3ChallengeRequest.builder()
                .correlationId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .last4SSN("1234")
                .build();

            V3ChallengeRequestResponse res = sdk.v3().v3ChallengeRequest()
                .request(req)
                .call();

            if (res.v3ChallengeResponse().isPresent()) {
                // handle response
            }
        } catch (com.prove.sdk.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.sdk.proveapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->


