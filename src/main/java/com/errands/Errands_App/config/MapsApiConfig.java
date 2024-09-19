package com.errands.Errands_App.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapsApiConfig {

    @Value("${maps.api.key}")
    private String apiKey;

    @Value("${maps.api.url}")
    private String apiUrl;

    public String getApiKey() {
        return apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}