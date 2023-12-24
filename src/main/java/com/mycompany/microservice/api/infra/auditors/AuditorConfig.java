package com.mycompany.microservice.api.infra.auditors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.lang.NonNull;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class AuditorConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }

    public static class AuditorAwareImpl implements AuditorAware<String> {

        @Override
        public @NonNull Optional<String> getCurrentAuditor() {

//      return Optional.ofNullable(SecurityContextHolder.getContext())
//          .map(SecurityContext::getAuthentication)
//          .filter(Authentication::isAuthenticated)
//          .flatMap(authentication -> AuthFacade.getUserEmailOptional());
            return Optional.of("Admin");
        }
    }
}
