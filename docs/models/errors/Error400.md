# Error400

Error400 is a custom error for HTTP 400. This is used to support distinguishing
between HTTP 400 and 500 in Speakeasy SDKs.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `code`                                                                             | *Optional\<Long>*                                                                  | :heavy_minus_sign:                                                                 | Code is an internal error code that describes the problem category of the request. | 1001                                                                               |
| `message`                                                                          | *String*                                                                           | :heavy_check_mark:                                                                 | Message is an error message describing the problem with the request.               | invalid request                                                                    |