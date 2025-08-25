# Domain
(*domain()*)

## Overview

### Available Operations

* [v3DomainID](#v3domainid) - Get Domain Details
* [v3DomainLink](#v3domainlink) - # Create a request to connect the requested domain to the domain the request is made from.
* [v3DomainLinked](#v3domainlinked) - Get the list of domains that are linked to this domain.
* [v3DomainUnlink](#v3domainunlink) - # Remove a domain link or request.

## v3DomainID

Returns the domain details.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainID" method="post" path="/v3/domain/id" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainIDResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainIDResponse res = sdk.domain().v3DomainID()
                .call();

        if (res.v3DomainIDResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[V3DomainIDResponse](../../models/operations/V3DomainIDResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainLink

# Create a request to connect the requested domain to the domain the request is made from.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainLink" method="post" path="/v3/domain/link" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3DomainLinkRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainLinkRequest req = V3DomainLinkRequest.builder()
                .pcid("pcid")
                .build();

        V3DomainLinkResponse res = sdk.domain().v3DomainLink()
                .request(req)
                .call();

        if (res.v3DomainLinkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [V3DomainLinkRequest](../../models/shared/V3DomainLinkRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[V3DomainLinkResponse](../../models/operations/V3DomainLinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainLinked

Returns the accepted and pending links for this domain.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainLinked" method="get" path="/v3/domain/linked" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainLinkedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainLinkedResponse res = sdk.domain().v3DomainLinked()
                .call();

        if (res.v3DomainLinkedResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V3DomainLinkedResponse](../../models/operations/V3DomainLinkedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainUnlink

# Remove a domain link or request.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainUnlink" method="post" path="/v3/domain/unlink" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3DomainUnlinkRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainUnlinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainUnlinkRequest req = V3DomainUnlinkRequest.builder()
                .pcidFrom("pcidFrom")
                .pcidTo("pcidTo")
                .build();

        V3DomainUnlinkResponse res = sdk.domain().v3DomainUnlink()
                .request(req)
                .call();

        if (res.v3DomainUnlinkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V3DomainUnlinkRequest](../../models/shared/V3DomainUnlinkRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V3DomainUnlinkResponse](../../models/operations/V3DomainUnlinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |