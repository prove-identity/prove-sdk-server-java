/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.prove.proveapi;

import com.prove.proveapi.utils.HTTPClient;
import com.prove.proveapi.utils.RetryConfig;
import com.prove.proveapi.utils.SpeakeasyHTTPClient;
import com.prove.proveapi.utils.Utils;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Prove APIs: This specification describes the Prove API.
 * 
 * <p>OpenAPI Spec - generated.
 */
public class Proveapi {

  
    /**
     * AvailableServers contains identifiers for the servers available to the SDK.
     */
    public enum AvailableServers {
        /**
         * UAT_US
         * 
         * <p>UAT for US Region
         */
      UAT_US("uat-us"),
        /**
         * PROD_US
         * 
         * <p>Prod for US Region
         */
      PROD_US("prod-us"),
        /**
         * UAT_EU
         * 
         * <p>UAT for EU Region
         */
      UAT_EU("uat-eu"),
        /**
         * PROD_EU
         * 
         * <p>Prod for EU Region
         */
      PROD_EU("prod-eu");

        private final String server;

        private AvailableServers(String server) {
            this.server = server;
        }

        public String server() {
           return server;
        }
    }

    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    @SuppressWarnings("serial")
    public static final Map<AvailableServers, String> SERVERS = new HashMap<>() { {
    put(AvailableServers.UAT_US, "https://platform.uat.proveapis.com");
    put(AvailableServers.PROD_US, "https://platform.proveapis.com");
    put(AvailableServers.UAT_EU, "https://platform.uat.eu.proveapis.com");
    put(AvailableServers.PROD_EU, "https://platform.eu.proveapis.com");
    }};

    private final V3 v3;

    public V3 v3() {
        return v3;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(com.prove.proveapi.models.components.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         *
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by name.
         *
         * @param server The server to use for all requests.
         * @return The builder instance.
         */
        public Builder server(AvailableServers server) {
            this.sdkConfiguration.server = server.server();
            this.sdkConfiguration.serverUrl = SERVERS.get(server);
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(com.prove.proveapi.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);  
            return this;  
        }
        
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(Consumer<? super com.prove.proveapi.utils.Hooks> consumer) {
            consumer.accept(sdkConfiguration.hooks());
            return this;    
        }
        
        /**
         * Builds a new instance of the SDK.
         *
         * @return The SDK instance.
         */
        public Proveapi build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS.get(AvailableServers.UAT_US);
                sdkConfiguration.server = AvailableServers.UAT_US.server();
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Proveapi(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     *
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Proveapi(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v3 = new V3(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }
}
