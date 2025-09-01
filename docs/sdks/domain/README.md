# Domain
(*domain()*)

## Overview

### Available Operations

* [v3DomainConfirmLinkRequest](#v3domainconfirmlinkrequest) - Confirm a domain link request
* [v3DomainIDRequest](#v3domainidrequest) - Get Domain Details
* [v3DomainLinkRequest](#v3domainlinkrequest) - Request a domain link
* [v3DomainLinkedRequest](#v3domainlinkedrequest) - Get the list of domains that are linked to this domain.
* [v3DomainUnlinkRequest](#v3domainunlinkrequest) - Remove a domain link or request

## v3DomainConfirmLinkRequest

Confirms a given domain link request by validating the PCID.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainConfirmLinkRequest" method="post" path="/v3/domain/confirm-link" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3DomainConfirmLinkRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainConfirmLinkRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainConfirmLinkRequest req = V3DomainConfirmLinkRequest.builder()
                .pcid("pcid")
                .build();

        V3DomainConfirmLinkRequestResponse res = sdk.domain().v3DomainConfirmLinkRequest()
                .request(req)
                .call();

        if (res.v3DomainConfirmLinkResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [V3DomainConfirmLinkRequest](../../models/shared/V3DomainConfirmLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[V3DomainConfirmLinkRequestResponse](../../models/operations/V3DomainConfirmLinkRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainIDRequest

Returns the domain details.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainIDRequest" method="get" path="/v3/domain/id" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainIDRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainIDRequestResponse res = sdk.domain().v3DomainIDRequest()
                .call();

        if (res.v3DomainIDResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V3DomainIDRequestResponse](../../models/operations/V3DomainIDRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainLinkRequest

Create a request to connect the requested domain to the domain the request is made from.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainLinkRequest" method="post" path="/v3/domain/link" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3DomainLinkRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainLinkRequestResponse;
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

        V3DomainLinkRequestResponse res = sdk.domain().v3DomainLinkRequest()
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

**[V3DomainLinkRequestResponse](../../models/operations/V3DomainLinkRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainLinkedRequest

Returns the accepted and pending links for this domain.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainLinkedRequest" method="get" path="/v3/domain/linked" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainLinkedRequestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Error401, Error403, Error, Exception {

        Proveapi sdk = Proveapi.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V3DomainLinkedRequestResponse res = sdk.domain().v3DomainLinkedRequest()
                .call();

        if (res.v3DomainLinkedResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V3DomainLinkedRequestResponse](../../models/operations/V3DomainLinkedRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## v3DomainUnlinkRequest

Remove a domain link or request between the requested domain and the domain the request is made from.

### Example Usage

<!-- UsageSnippet language="java" operationID="V3DomainUnlinkRequest" method="post" path="/v3/domain/unlink" -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3DomainUnlinkRequest;
import com.prove.proveapi.models.errors.*;
import com.prove.proveapi.models.errors.Error;
import com.prove.proveapi.models.operations.V3DomainUnlinkRequestResponse;
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

        V3DomainUnlinkRequestResponse res = sdk.domain().v3DomainUnlinkRequest()
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

**[V3DomainUnlinkRequestResponse](../../models/operations/V3DomainUnlinkRequestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 400                    | application/json       |
| models/errors/Error401 | 401                    | application/json       |
| models/errors/Error403 | 403                    | application/json       |
| models/errors/Error    | 500                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |