package com.pac.pacjulius.test;

import com.pac.pacjulius.entities.Item;
import com.pac.pacjulius.entities.Usuario;
import com.pac.pacjulius.repositories.ItemRepository;
import com.pac.pacjulius.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("test")
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final ItemRepository itemRepository;

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

        Item i1 = Item.builder()
                .nome("One Piece")
                .dataCriacao(Instant.parse("2025-03-20T19:53:07Z"))
                .quantidadeMinima(10)
                .quantidadeTotal(10)
                .build();

        Item i2 = Item.builder()
                .nome("Carretilha")
                .dataCriacao(Instant.parse("2025-03-20T19:53:07Z"))
                .quantidadeMinima(5)
                .quantidadeTotal(2)
                .build();

        itemRepository.saveAll(Arrays.asList(i1, i2));

    }

}
