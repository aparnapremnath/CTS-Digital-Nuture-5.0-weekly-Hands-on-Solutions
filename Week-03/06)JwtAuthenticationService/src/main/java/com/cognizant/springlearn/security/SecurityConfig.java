package com.cognizant.springlearn.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);

	@Bean
	public PasswordEncoder passwordEncoder() {
		LOGGER.info("Start passwordEncoder()");
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		LOGGER.info("Start filterChain()");

		AuthenticationManagerBuilder authBuilder = httpSecurity.getSharedObject(AuthenticationManagerBuilder.class);
		authBuilder.inMemoryAuthentication()
				.withUser("admin").password(passwordEncoder().encode("pwd")).roles("ADMIN")
				.and()
				.withUser("user").password(passwordEncoder().encode("pwd")).roles("USER");

		AuthenticationManager authenticationManager = authBuilder.build();
		httpSecurity.authenticationManager(authenticationManager);

		httpSecurity
				.csrf(csrf -> csrf.disable())
				.httpBasic(httpBasic -> {})
				.authorizeHttpRequests(authorize -> authorize
						.requestMatchers("/countries").hasRole("USER")
						.requestMatchers("/authenticate").hasAnyRole("USER", "ADMIN")
						.anyRequest().permitAll());

		LOGGER.info("End filterChain()");
		return httpSecurity.build();
	}

}