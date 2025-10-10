package com.pac.pacjulius.resources;

import com.pac.pacjulius.entities.Item;
import com.pac.pacjulius.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value ="/items")
public class ItemResource {

    private final ItemService service;

    public ItemResource(ItemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Item>> findAll() {
    List<Item> lista = service.findAll();
    return ResponseEntity.ok().body(lista);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Item> findById(@PathVariable Long id) {
        Item obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Item> insert(@RequestBody Item obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Item> update(@PathVariable Long id, @RequestBody Item obj) {
        obj = service.update(obj, id);
        return ResponseEntity.ok().body(obj);
    }


}
