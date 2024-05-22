<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.prove.proveapi.proveapi.Proveapi;
import com.prove.proveapi.proveapi.models.components.*;
import com.prove.proveapi.proveapi.models.components.Security;
import com.prove.proveapi.proveapi.models.operations.*;
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
        } catch (com.prove.proveapi.proveapi.models.errors.Error e) {
            // handle exception
            throw e;
        } catch (com.prove.proveapi.proveapi.models.errors.SDKError e) {
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