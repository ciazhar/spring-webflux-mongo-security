package com.ciazhar.springwebflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.MapUserDetailsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsRepository;

/**
 * Created by ciazhar on 11/6/17.
 * <p>
 * [ Documentation Here ]
 */

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig{

    @Bean
    UserDetailsRepository userDetailsRepository(){
        UserDetails admin = User.withUsername("admin").password("123").roles("ADMIN").build();
        UserDetails ciazhar = User.withUsername("ciazhar").password("123").roles("USER").build();

        return new MapUserDetailsRepository(admin,ciazhar);
    }

}
