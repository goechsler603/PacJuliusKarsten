package com.pac.pacjulius.services;

import com.pac.pacjulius.entities.Usuario;
import com.pac.pacjulius.repositories.UsuarioRepository;
import com.pac.pacjulius.services.exceptions.DatabaseException;
import com.pac.pacjulius.services.exceptions.ResourceNotFoundException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> findAll() {return repository.findAll();}

    public Usuario findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Usuario Insert(Usuario usuario) {
        return repository.save(usuario);
    }

    public void Delete(Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        try {
            repository.deleteById(id);
        }catch (DataIntegrityViolationException erro){
            throw new DatabaseException(erro.getMessage());
        }
    }

    public Usuario Update(Usuario obj, Long id) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
            Usuario entidade =repository.findById(id).get();
            updateData(entidade, obj);
            return repository.save(entidade);
    }

    public void updateData(Usuario entidade, Usuario obj) {
        entidade.setNome(obj.getNome());
        entidade.setEmail(obj.getEmail());
    }

}
