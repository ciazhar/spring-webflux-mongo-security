package com.ciazhar.springwebflux.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurationSupport;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

@Configuration
public class CorsConfig extends WebFluxConfigurationSupport {
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","PUT","DELETE");
    }
}
