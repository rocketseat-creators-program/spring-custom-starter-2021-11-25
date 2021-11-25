package br.com.rocketseat.expert.starter.salute;

import java.time.LocalDateTime;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Salute {
	
    private final SaluteConfig saluteConfig;

    public String greet(LocalDateTime localDateTime) {
        String name = saluteConfig.getUserName();
        int hourOfDay = localDateTime.getHour();

        if (hourOfDay >= 5 && hourOfDay < 12) {
            return String.format("Hello %s, %s", name, saluteConfig.getMorningGreeting());
        } else if (hourOfDay >= 12 && hourOfDay < 17) {
            return String.format("Hello %s, %s", name, saluteConfig.getAfternoonGreeting());
        } else if (hourOfDay >= 17 && hourOfDay < 20) {
            return String.format("Hello %s, %s", name, saluteConfig.getEveningGreeting());
        } else {
            return String.format("Hello %s, %s", name, saluteConfig.getNightGreeting());
        }
    }

    public String greet() {
        return greet(LocalDateTime.now());
    }
}