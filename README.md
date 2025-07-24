# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
</div>

<!-- Start Summary [summary] -->
## Summary

Prove APIs: This specification describes the Prove API.

OpenAPI Spec - generated.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Authentication](#authentication)
  * [Debugging](#debugging)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.prove:proveapi:0.17.0'
```

Maven:
```xml
<dependency>
    <groupId>com.prove</groupId>
    <artifactId>proveapi</artifactId>
    <version>0.17.0</version>
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [identity()](docs/sdks/identity/README.md)

* [v3BatchGetIdentities](docs/sdks/identity/README.md#v3batchgetidentities) - Batch Get Identities
* [v3EnrollIdentity](docs/sdks/identity/README.md#v3enrollidentity) - Enroll Identity
* [v3BatchEnrollIdentities](docs/sdks/identity/README.md#v3batchenrollidentities) - Batch Enroll Identities
* [v3DisenrollIdentity](docs/sdks/identity/README.md#v3disenrollidentity) - Disenroll Identity
* [v3GetIdentity](docs/sdks/identity/README.md#v3getidentity) - Get Identity
* [v3ActivateIdentity](docs/sdks/identity/README.md#v3activateidentity) - Activate Identity
* [v3DeactivateIdentity](docs/sdks/identity/README.md#v3deactivateidentity) - Deactivate Identity
* [v3GetIdentitiesByPhoneNumber](docs/sdks/identity/README.md#v3getidentitiesbyphonenumber) - Get Identities By Phone Number


### [v3()](docs/sdks/v3/README.md)

* [v3TokenRequest](docs/sdks/v3/README.md#v3tokenrequest) - Request OAuth Token
* [v3ChallengeRequest](docs/sdks/v3/README.md#v3challengerequest) - Submit Challenge
* [v3CompleteRequest](docs/sdks/v3/README.md#v3completerequest) - Complete Flow
* [v3StartRequest](docs/sdks/v3/README.md#v3startrequest) - Start Flow
* [v3UnifyRequest](docs/sdks/v3/README.md#v3unifyrequest) - Initiate Possession Check
* [v3UnifyBindRequest](docs/sdks/v3/README.md#v3unifybindrequest) - Bind Prove Key
* [v3UnifyStatusRequest](docs/sdks/v3/README.md#v3unifystatusrequest) - Check Status
* [v3ValidateRequest](docs/sdks/v3/README.md#v3validaterequest) - Validate Phone Number
* [v3VerifyRequest](docs/sdks/v3/README.md#v3verifyrequest) - Initiate Verified Users Session
* [v3VerifyStatusRequest](docs/sdks/v3/README.md#v3verifystatusrequest) - Check Verification Result

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `v3TokenRequest` method throws the following exceptions:

| Error Type             | Status Code | Content Type     |
| ---------------------- | ----------- | ---------------- |
| models/errors/Error400 | 400         | application/json |
| models/errors/Error401 | 401         | application/json |
| models/errors/Error    | 500         | application/json |
| models/errors/SDKError | 4XX, 5XX    | \*/\*            |

### Example

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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Name

You can override the default server globally using the `.server(AvailableServers server)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the names associated with the available servers:

| Name      | Server                                  | Description        |
| --------- | --------------------------------------- | ------------------ |
| `uat-us`  | `https://platform.uat.proveapis.com`    | UAT for US Region  |
| `prod-us` | `https://platform.proveapis.com`        | Prod for US Region |
| `uat-eu`  | `https://platform.uat.eu.proveapis.com` | UAT for EU Region  |
| `prod-eu` | `https://platform.eu.proveapis.com`     | Prod for EU Region |

#### Example

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
                .server(Proveapi.AvailableServers.PROD_EU)
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

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
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
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                          | Type   | Scheme                         |
| ----------------------------- | ------ | ------------------------------ |
| `clientID`<br/>`clientSecret` | oauth2 | OAuth2 Client Credentials Flow |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3TokenRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error400, Error401, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug
You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:
```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->
