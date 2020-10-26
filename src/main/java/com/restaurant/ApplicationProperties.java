package com.restaurant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class ApplicationProperties {

    @Value("${mongodb.host:8877}")
    private String mongoDbHost;
    private int mongoDbPort;

}
