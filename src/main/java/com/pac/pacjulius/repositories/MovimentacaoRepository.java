package com.pac.pacjulius.repositories;

import com.pac.pacjulius.entities.Item;
import com.pac.pacjulius.entities.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    List<Movimentacao> id(Long id);
}
