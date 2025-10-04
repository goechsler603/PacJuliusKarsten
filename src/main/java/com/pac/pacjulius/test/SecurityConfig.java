package com.pac.pacjulius.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Desabilita CSRF no estilo novo
                .csrf(csrf -> csrf.disable())
                // Necessário para o H2 Console (usa frames/iframes)
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))
                // Define as permissões
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .requestMatchers("/api/**").permitAll()
                        .anyRequest().authenticated()
                )
                // Mantém a tela de login padrão
                .formLogin(login -> login.permitAll());

        return http.build();
    }
}
