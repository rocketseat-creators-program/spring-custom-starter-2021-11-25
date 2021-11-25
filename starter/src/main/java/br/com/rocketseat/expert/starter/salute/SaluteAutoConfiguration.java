package br.com.rocketseat.expert.starter.salute;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableConfigurationProperties(SaluteProperties.class)
@ConditionalOnClass(Salute.class)
@RequiredArgsConstructor
public class SaluteAutoConfiguration {

    private final SaluteProperties saluteProperties;

    @Bean
    @ConditionalOnMissingBean
    public SaluteConfig greeterConfig() {
        String userName = saluteProperties.getUserName() == null ? System.getProperty("user.name") : saluteProperties.getUserName();
        String morningGreeting = saluteProperties.getMorningGreeting() == null ? "Good Morning" : saluteProperties.getMorningGreeting();
        String afternoonGreeting = saluteProperties.getAfternoonGreeting() == null ? "Good Afternoon" : saluteProperties.getAfternoonGreeting();
        String eveningGreeting = saluteProperties.getEveningGreeting() == null ? "Good Evening" : saluteProperties.getEveningGreeting();
        String nightGreeting = saluteProperties.getNightGreeting() == null ? "Good Night" : saluteProperties.getNightGreeting();

        return SaluteConfig.builder()
                .userName(userName)
                .morningGreeting(morningGreeting)
                .afternoonGreeting(afternoonGreeting)
                .eveningGreeting(eveningGreeting)
                .nightGreeting(nightGreeting)
                .build();
    }

    @Bean
    @ConditionalOnMissingBean
    public Salute greeter(SaluteConfig saluteConfig) {
        return new Salute(saluteConfig);
    }
}