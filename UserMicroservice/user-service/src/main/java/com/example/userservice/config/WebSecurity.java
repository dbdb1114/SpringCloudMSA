package com.example.userservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurity {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(configurer -> configurer.disable());
        http.authorizeHttpRequests((authoz)->{
            authoz.requestMatchers("/users/**").permitAll();
            authoz.anyRequest().permitAll();
        });

        http.headers(configurer->configurer.frameOptions(frameConfig->frameConfig.disable()));

        return http.build();
    }

}
