package com.pac.pacjulius.services;

import com.pac.pacjulius.entities.Item;
import com.pac.pacjulius.repositories.ItemRepository;
import com.pac.pacjulius.services.exceptions.DatabaseException;
import com.pac.pacjulius.services.exceptions.ResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> findAll() {return repository.findAll();}

    public Item findById(Long id) {
        Optional<Item> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Item insert(Item Item) {
        return repository.save(Item);
    }

    public void delete (Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException erro){
            throw new DatabaseException(erro.getMessage());
        }
    }

    public Item update(Item obj, Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
            Item entidade =repository.findById(id).get();
            updateData(entidade, obj);
            return repository.save(entidade);
    }

    public void updateData(Item entidade, Item obj) {
        entidade.setNome(obj.getNome());
        entidade.setQuantidadeMinima(obj.getQuantidadeMinima());
    }

}
