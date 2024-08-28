<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.prove.proveapi.Proveapi;
import com.prove.proveapi.models.components.Security;
import com.prove.proveapi.models.components.V3StartRequest;
import com.prove.proveapi.models.errors.SDKError;
import com.prove.proveapi.models.operations.V3StartRequestResponse;
import java.lang.Exception;

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
                .dob("1981-01")
                .emailAddress("mpinsonm@dyndns.org")
                .finalTargetUrl("https://www.example.com/landing-page")
                .ipAddress("10.0.0.1")
                .phoneNumber("2001001695")
                .ssn("0596")
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
        } catch (SDKError e) {
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