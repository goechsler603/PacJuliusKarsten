package com.pac.pacjulius.resources;

import com.pac.pacjulius.entities.Movimentacao;
import com.pac.pacjulius.services.MovimentacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value ="/Movimentacaos")
public class MovimentacaoResource {

    private final MovimentacaoService service;

    public MovimentacaoResource(MovimentacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Movimentacao>> findAll() {
    List<Movimentacao> lista = service.findAll();
    return ResponseEntity.ok().body(lista);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Movimentacao> findById(@PathVariable Long id) {
        Movimentacao obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Movimentacao> insert(@RequestBody Movimentacao obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }




}
