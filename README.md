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
  * [Asynchronous Support](#asynchronous-support)
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
implementation 'com.prove:proveapi:0.19.0'
```

Maven:
```xml
<dependency>
    <groupId>com.prove</groupId>
    <artifactId>proveapi</artifactId>
    <version>0.19.0</version>
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

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

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
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.prove.proveapi.AsyncProveapi;
import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.V3TokenRequest;
import com.prove.proveapi.models.operations.async.V3TokenRequestResponse;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncProveapi sdk = Proveapi.builder()
            .build()
            .async();

        V3TokenRequest req = V3TokenRequest.builder()
                .clientId("customer_id")
                .clientSecret("secret")
                .grantType("client_credentials")
                .build();

        CompletableFuture<V3TokenRequestResponse> resFut = sdk.v3().v3TokenRequest()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.v3TokenResponse().isPresent()) {
            // handle response
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [domain()](docs/sdks/domain/README.md)

* [v3DomainConfirmLinkRequest](docs/sdks/domain/README.md#v3domainconfirmlinkrequest) - Confirm a domain link request
* [v3DomainIDRequest](docs/sdks/domain/README.md#v3domainidrequest) - Get Domain Details
* [v3DomainLinkRequest](docs/sdks/domain/README.md#v3domainlinkrequest) - Request a domain link
* [v3DomainLinkedRequest](docs/sdks/domain/README.md#v3domainlinkedrequest) - Get the list of domains that are linked to this domain.
* [v3DomainUnlinkRequest](docs/sdks/domain/README.md#v3domainunlinkrequest) - Remove a domain link or request

### [identity()](docs/sdks/identity/README.md)

* [v3BatchGetIdentities](docs/sdks/identity/README.md#v3batchgetidentities) - Batch Get Identities
* [v3EnrollIdentity](docs/sdks/identity/README.md#v3enrollidentity) - Enroll Identity
* [v3BatchEnrollIdentities](docs/sdks/identity/README.md#v3batchenrollidentities) - Batch Enroll Identities
* [v3DisenrollIdentity](docs/sdks/identity/README.md#v3disenrollidentity) - Disenroll Identity
* [v3GetIdentity](docs/sdks/identity/README.md#v3getidentity) - Get Identity
* [v3ActivateIdentity](docs/sdks/identity/README.md#v3activateidentity) - Activate Identity
* [v3CrossDomainIdentity](docs/sdks/identity/README.md#v3crossdomainidentity) - Cross Domain Identity
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
* [v3VerifyBatchRequest](docs/sdks/v3/README.md#v3verifybatchrequest) - Batch Verify Users

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `v3TokenRequest` method throws the following exceptions:

| Error Type             | Status Code | Content Type     |
| ---------------------- | ----------- | ---------------- |
| models/errors/Error    | 400         | application/json |
| models/errors/Error401 | 401         | application/json |
| models/errors/Error    | 500         | application/json |
| models/errors/SDKError | 4XX, 5XX    | \*/\*            |

### Example

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
import com.prove.proveapi.models.errors.Error401;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error, Exception {

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
import com.prove.proveapi.models.errors.Error401;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error, Exception {

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

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                                         | Type   | Scheme                         |
| -------------------------------------------- | ------ | ------------------------------ |
| `clientID`<br/>`clientSecret`<br/>`tokenURL` | oauth2 | OAuth2 Client Credentials Flow |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3TokenRequest;
import com.prove.proveapi.models.errors.Error401;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3TokenRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error, Exception {

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
