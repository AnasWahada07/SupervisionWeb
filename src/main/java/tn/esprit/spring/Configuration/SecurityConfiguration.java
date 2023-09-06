/*
package tn.esprit.spring.Configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.http.HttpMethod.*;
import static tn.esprit.spring.entities.Permission.*;
import static tn.esprit.spring.entities.Role.ADMIN;
import static tn.esprit.spring.entities.Role.MANAGER;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfiguration {

    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity

                .authorizeRequests()
                .requestMatchers("/api/v1/auth/**").permitAll() // Specific rule for public resources
                .requestMatchers("/api/v1/admin/**").hasRole(ADMIN.name())
                .requestMatchers(GET ,"/api/v1/admin/**" ).hasAuthority(ADMIN_READ.name())
                .requestMatchers(POST, "/api/v1/admin/**").hasAuthority(ADMIN_CREATE.name())
                .requestMatchers(PUT, "/api/v1/admin/**").hasAuthority(ADMIN_UPDATE.name())
                .requestMatchers(DELETE, "/api/v1/admin/**").hasAuthority(ADMIN_DELETE.name())

                .requestMatchers("/api/v1/management/**").hasRole(MANAGER.name())
                .requestMatchers(GET, "/api/v1/management/**").hasAnyAuthority(ADMIN_READ.name(), MANAGER_READ.name())
                .requestMatchers(POST, "/api/v1/management/**").hasAnyAuthority(ADMIN_CREATE.name(), MANAGER_CREATE.name())
                .requestMatchers(PUT, "/api/v1/management/**").hasAnyAuthority(ADMIN_UPDATE.name(), MANAGER_UPDATE.name())
                .requestMatchers(DELETE, "/api/v1/management/**").hasAnyAuthority(ADMIN_DELETE.name(), MANAGER_DELETE.name())
                .anyRequest().authenticated()
                .and().authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

                 // Generic rule for authenticated requests
                return httpSecurity.build();

    }
}

 .authorizeRequests(authorizeRequests -> authorizeRequests
 .requestMatchers("/api/v1/auth/").permitAll() // URL public access
 .anyRequest().authenticated()  // All other URLs require authentication

 .requestMatchers("/api/v1/admin/**").hasRole(ADMIN.name())

 .requestMatchers(GET, "/api/v1/admin/**").hasAuthority(ADMIN_READ.name())
 .requestMatchers(POST, "/api/v1/admin/**").hasAuthority(ADMIN_CREATE.name())
 .requestMatchers(PUT, "/api/v1/admin/**").hasAuthority(ADMIN_UPDATE.name())
 .requestMatchers(DELETE, "/api/v1/admin/**").hasAuthority(ADMIN_DELETE.name())

 .requestMatchers("/api/v1/management/**").hasAnyRole(ADMIN.name(), MANAGER.name())
 .requestMatchers(GET, "/api/v1/management/**").hasAnyAuthority(ADMIN_READ.name(), MANAGER_READ.name())
 .requestMatchers(POST, "/api/v1/management/**").hasAnyAuthority(ADMIN_CREATE.name(), MANAGER_CREATE.name())
 .requestMatchers(PUT, "/api/v1/management/**").hasAnyAuthority(ADMIN_UPDATE.name(), MANAGER_UPDATE.name())
 .requestMatchers(DELETE, "/api/v1/management/**").hasAnyAuthority(ADMIN_DELETE.name(), MANAGER_DELETE.name())




 .anyRequest()
 .authenticated()
 .and().authenticationProvider(authenticationProvider)
 .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class));


 return httpSecurity.build();
 }
 }


*/
