# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
</div>

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.prove:proveapi:0.5.4'
```

Maven:
```xml
<dependency>
    <groupId>com.prove</groupId>
    <artifactId>proveapi</artifactId>
    <version>0.5.4</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.*;
import com.prove.proveapi.models.components.Security;
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
                .deviceId("713189b8-5555-4b08-83ba-75d08780aebd")
                .dob("2024-05-02T00:00:00Z")
                .emailAddress("jdoe@example.com")
                .finalTargetUrl("https://www.example.com/landing-page")
                .flowId("prove-standard-prefill-i1")
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [v3()](docs/sdks/v3/README.md)

* [v3TokenRequest](docs/sdks/v3/README.md#v3tokenrequest) - Request OAuth token.
* [v3ChallengeRequest](docs/sdks/v3/README.md#v3challengerequest) - Submit challenge.
* [v3CompleteRequest](docs/sdks/v3/README.md#v3completerequest) - Complete flow.
* [v3StartRequest](docs/sdks/v3/README.md#v3startrequest) - Start flow.
* [v3ValidateRequest](docs/sdks/v3/README.md#v3validaterequest) - Validate phone number.
<!-- End Available Resources and Operations [operations] -->

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
                .server(Proveapi.AvailableServers.PROD_US)
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://platform.uat.proveapis.com")
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name           | Type           | Scheme         |
| -------------- | -------------- | -------------- |
| `clientID`     | oauth2         | OAuth2 token   |
| `clientSecret` | oauth2         | OAuth2 token   |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->
