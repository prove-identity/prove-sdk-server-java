# Error400

Bad Request. The server cannot process the request due to a client error.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `code`                                                                             | *Optional<Long>*                                                                   | :heavy_minus_sign:                                                                 | Code is an internal error code that describes the problem category of the request. | 8002                                                                               |
| `message`                                                                          | *String*                                                                           | :heavy_check_mark:                                                                 | Message is an error message describing the problem with the request.               | not authorized                                                                     |