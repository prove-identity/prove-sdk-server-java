<!-- Start SDK Example Usage [usage] -->
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
<!-- End SDK Example Usage [usage] -->