package br.com.rocketseat.expert.starter.salute;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SaluteConfig {
    private final String userName;
    private final String morningGreeting;
    private final String afternoonGreeting;
    private final String eveningGreeting;
    private final String nightGreeting;
}
