/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.sdk.proveapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public interface HTTPClient {
    HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException;
}
