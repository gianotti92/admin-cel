package com.gestion.jc;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JcApplication {

    public static void main(String[] args) {
        Application.launch(AdminApplication.class, args);
    }

}
