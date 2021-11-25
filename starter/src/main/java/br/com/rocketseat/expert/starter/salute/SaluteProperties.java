package br.com.rocketseat.expert.starter.salute;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "expert.salute")
public class SaluteProperties {
    private String userName;

    private String morningGreeting;

    private String afternoonGreeting;

    private String eveningGreeting;
    
    private String nightGreeting;
}