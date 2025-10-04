package com.pac.pacjulius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pac"})
public class PacJuliusApplication {

    public static void main(String[] args) {
        SpringApplication.run(PacJuliusApplication.class, args);
    }

}
