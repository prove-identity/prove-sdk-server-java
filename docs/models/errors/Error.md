# Error

Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `code`                                                                             | *Optional<Long>*                                                                   | :heavy_minus_sign:                                                                 | Code is an internal error code that describes the problem category of the request. | 8000                                                                               |
| `message`                                                                          | *String*                                                                           | :heavy_check_mark:                                                                 | Message is an error message describing the problem with the request.               | error at prove, try again later                                                    |