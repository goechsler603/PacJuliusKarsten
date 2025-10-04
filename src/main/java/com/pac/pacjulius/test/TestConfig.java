package com.pac.pacjulius.test;

import com.pac.pacjulius.entities.Usuario;
import com.pac.pacjulius.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario u1 = Usuario.builder()
                .email("jose@email.com")
                .nome("Jose")
                .senha("123456")
                .build();
        Usuario u2 = Usuario.builder()
                .email("jeliel@email.com")
                .nome("Jeliel")
                .senha("123456")
                .build();
        Usuario u3 = Usuario.builder()
                .email("gui@email.com")
                .nome("Gui")
                .senha("123456")
                .build();
        usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));

    }
}
