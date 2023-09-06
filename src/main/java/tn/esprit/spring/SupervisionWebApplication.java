package tn.esprit.spring;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*
import tn.esprit.spring.Service.AuthenticationService;
import tn.esprit.spring.Service.RegisterRequest;
import tn.esprit.spring.entities.Role;

import static tn.esprit.spring.entities.Role.ADMIN;
import static tn.esprit.spring.entities.Role.MANAGER;
*/

@SpringBootApplication
@Log4j2
public class SupervisionWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupervisionWebApplication.class, args);
    }

 /**   @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var manager = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getAccessToken());

        };
    } **/
}

