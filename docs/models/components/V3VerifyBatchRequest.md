# V3VerifyBatchRequest


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `clientRequestId`                                                               | *Optional\<String>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             |
| `items`                                                                         | List\<[VerifyItem](../../models/components/VerifyItem.md)>                      | :heavy_check_mark:                                                              | Batch of verify requests to process. The array length cannot exceed 1000 items. |