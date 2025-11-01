package com.pac.pacjulius.services;

import com.pac.pacjulius.entities.Movimentacao;
import com.pac.pacjulius.repositories.MovimentacaoRepository;
import com.pac.pacjulius.services.exceptions.DatabaseException;
import com.pac.pacjulius.services.exceptions.ResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository repository;

    public MovimentacaoService(MovimentacaoRepository repository) {
        this.repository = repository;
    }

    public List<Movimentacao> findAll() {return repository.findAll();}

    public Movimentacao findById(Long id) {
        Optional<Movimentacao> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Movimentacao insert(Movimentacao Movimentacao) {
        return repository.save(Movimentacao);
    }

    public void delete (Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException erro){
            throw new DatabaseException(erro.getMessage());
        }
    }



}
