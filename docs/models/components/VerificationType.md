# VerificationType

The verification method based on the use case and authorization level. Current allowed values: "verifiedUser", "accountOpening", "humanAssurance", "prefill", "prefillForBiz", "identityResolution".

## Example Usage

```java
import com.prove.proveapi.models.components.VerificationType;

VerificationType value = VerificationType.HUMAN_ASSURANCE;
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `HUMAN_ASSURANCE`     | humanAssurance        |
| `VERIFIED_USER`       | verifiedUser          |
| `ACCOUNT_OPENING`     | accountOpening        |
| `PREFILL`             | prefill               |
| `PREFILL_FOR_BIZ`     | prefillForBiz         |
| `IDENTITY_RESOLUTION` | identityResolution    |