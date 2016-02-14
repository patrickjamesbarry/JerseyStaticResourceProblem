package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    /**
     * Configure Jersey
     */
    @Configuration
    static class JerseyConfig extends ResourceConfig {
        /**
         * We just need the packages that have REST resources in them.
         */
        public JerseyConfig() {
            packages("com.example");
            property(ServletProperties.FILTER_FORWARD_ON_404, true);

        }
    }
}
