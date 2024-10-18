package com.NanRazvan.java_fitness_app.config;//package com.NanRazvan.java_fitness_app.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        logger.info("Configurația de securitate este aplicată.");
//
//        http
//                .authorizeHttpRequests((requests) -> requests
//                        .anyRequest().permitAll()
//                )
//                .csrf(AbstractHttpConfigurer::disable);
//
//        return http.build();
//    }
//}
//
