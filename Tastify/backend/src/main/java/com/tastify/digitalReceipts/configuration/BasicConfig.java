package com.tastify.digitalReceipts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BasicConfig implements WebMvcConfigurer {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders getHttpHeaders() {
        return new HttpHeaders();
    }

}
