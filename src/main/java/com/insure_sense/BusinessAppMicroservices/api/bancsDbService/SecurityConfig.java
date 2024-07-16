package com.insure_sense.BusinessAppMicroservices.api.bancsDbService;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.csrf.CookieServerCsrfTokenRepository;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
            .authorizeExchange(exchanges ->
                exchanges
                    .pathMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/actuator/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/health/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/trace/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/webjars/swagger-ui/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/v3/api-docs/**").permitAll()
                    .pathMatchers(HttpMethod.GET, "/getQuote/*").hasAuthority("SCOPE_message:read")
                    .pathMatchers(HttpMethod.POST, "/getQuote").hasAuthority("SCOPE_message:write")
                    .pathMatchers(HttpMethod.PATCH, "/getQuote/*").hasAuthority("SCOPE_message:write")
                    .pathMatchers(HttpMethod.DELETE, "/getQuote/*").hasAuthority("SCOPE_message:write")
                    .anyExchange().authenticated()
            )
            .csrf(csrf -> csrf
                .csrfTokenRepository(CookieServerCsrfTokenRepository.withHttpOnlyFalse()))
            .oauth2ResourceServer(oauth2ResourceServer ->
                oauth2ResourceServer
                    .jwt(withDefaults())
            );
        return http.build();
    }
}
