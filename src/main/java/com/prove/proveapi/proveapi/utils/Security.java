/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.proveapi.proveapi.utils;


import java.lang.reflect.Field;
import java.util.Base64;

import org.apache.http.message.BasicNameValuePair;

public final class Security {
    
    private Security() {
        // prevent instantiation
    }
    
    public static HTTPRequest configureSecurity(HTTPRequest request, Object security) throws Exception {
        if (security != null) {
            Field[] fields = security.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = Utils.resolveOptionals(field.get(security));
                if (value == null) {
                    continue;
                }

                SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
                if (securityMetadata == null) {
                    continue;
                }

                if (securityMetadata.option) {
                    parseSecurityOption(request, value);
                } else if (securityMetadata.scheme) {
                    if ((securityMetadata.subtype != null && securityMetadata.subtype.equals("basic"))
                            && Types.getType(value.getClass()) != Types.OBJECT) {
                        parseSecurityScheme(request, securityMetadata, security);
                    } else {
                        parseSecurityScheme(request, securityMetadata, value);
                    }
                }
            }
        }
        return request;
    }

    private static void parseSecurityOption(HTTPRequest request, Object option)
            throws Exception {
        Field[] fields = option.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = Utils.resolveOptionals(field.get(option));
            
            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || !securityMetadata.scheme) {
                continue;
            }

            parseSecurityScheme(request, securityMetadata, value);
        }
    }

    private static void parseSecurityScheme(HTTPRequest requestBuilder, SecurityMetadata schemeMetadata,
            Object scheme) throws Exception {

        if (Types.getType(scheme.getClass()) == Types.OBJECT) {
            if (schemeMetadata.type.equals("http") && schemeMetadata.subtype.equals("basic")) {
                parseBasicAuthScheme(requestBuilder, scheme);
                return;
            }

            Field[] fields = scheme.getClass().getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = Utils.resolveOptionals(field.get(scheme));

                if (value == null) {
                    continue;
                }

                SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
                if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                    continue;
                }

                parseSecuritySchemeValue(requestBuilder, schemeMetadata, securityMetadata, value);
            }
        } else {
            parseSecuritySchemeValue(requestBuilder, schemeMetadata, schemeMetadata, scheme);
        }
    }

    private static void parseSecuritySchemeValue(HTTPRequest request, SecurityMetadata schemeMetadata,
            SecurityMetadata securityMetadata,
            Object value) throws Exception {
        switch (schemeMetadata.type) {
            case "apiKey":
                switch (schemeMetadata.subtype) {
                    case "header":
                        request.addHeader(securityMetadata.name, Utils.valToString(value));
                        break;
                    case "query":
                        request.addQueryParam(
                                securityMetadata.name, Utils.valToString(value));
                        break;
                    case "cookie":
                        request.addHeader("Cookie",
                                String.format("%s=%s", securityMetadata.name, Utils.valToString(value)));
                        break;
                    default:
                        throw new RuntimeException(
                                "Unsupported security scheme subtype for apiKey: " + securityMetadata.subtype);
                }
                break;
            case "openIdConnect":
                request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                break;
            case "oauth2":
                request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                break;
            case "http":
                switch (schemeMetadata.subtype) {
                    case "bearer":
                        request.addHeader(securityMetadata.name, Utils.prefixBearer(Utils.valToString(value)));
                        break;
                    default:
                        throw new RuntimeException("Unsupported security scheme subtype for bearer");
                }
                break;
            default:
                throw new RuntimeException("Unsupported security scheme type");
        }
    }

    private static void parseBasicAuthScheme(HTTPRequest requestBuilder, Object scheme)
            throws IllegalAccessException {
        Field[] fields = scheme.getClass().getDeclaredFields();

        String username = "";
        String password = "";

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = Utils.resolveOptionals(field.get(scheme));

            if (value == null) {
                continue;
            }

            SecurityMetadata securityMetadata = SecurityMetadata.parse(field);
            if (securityMetadata == null || securityMetadata.name.isEmpty()) {
                continue;
            }

            switch (securityMetadata.name) {
                case "username":
                    username = Utils.valToString(value);
                    break;
                case "password":
                    password = Utils.valToString(value);
                    break;
                default:
                    throw new RuntimeException("Unsupported security scheme field for basic auth: " + securityMetadata.name);
            }
        }

        requestBuilder.addHeader("Authorization",
                "Basic " + Base64.getEncoder().encodeToString(String.format("%s:%s", username, password).getBytes()));
    }
}