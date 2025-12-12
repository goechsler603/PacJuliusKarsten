package com.pac.pacv2back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.http.*;
import org.springframework.data.jpa.repository.*;
import jakarta.persistence.*;
import java.util.*;

@SpringBootApplication
public class Aplicacao {
    public static void main(String[] args) {
        SpringApplication.run(Aplicacao.class, args);
    }
}

/* ==================== ENTIDADE ITEM ==================== */

@Entity
class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;
    public String categoria;
    public String localArmazenamento;

    public Integer quantidade;
    public Integer quantidadeMinima;

    public String ultimaEntrada;
}

/* ==================== REPOSITÓRIO ==================== */

interface ItemRepository extends JpaRepository<Item, Long> {}

/* ==================== SERVIÇO ==================== */

@Service
class ItemService {
    private final ItemRepository repo;

    ItemService(ItemRepository r){
        this.repo = r;
    }

    public List<Item> listar(){
        return repo.findAll();
    }

    public Item salvar(Item i){
        return repo.save(i);
    }

    public Optional<Item> buscar(Long id){
        return repo.findById(id);
    }

    public void deletar(Long id){
        repo.deleteById(id);
    }

    /* ============= ENTRADA DE MATERIAL ============= */

    public Item entrada(Long id, int qtd){
        Item item = repo.findById(id).orElseThrow();

        item.quantidade += qtd;
        item.ultimaEntrada = new Date().toInstant().toString().substring(0, 10);

        return repo.save(item);
    }

    /* ============= SAÍDA DE MATERIAL ============= */

    public Item saida(Long id, int qtd){
        Item item = repo.findById(id).orElseThrow();

        if (item.quantidade - qtd < 0){
            throw new RuntimeException("Quantidade insuficiente em estoque!");
        }

        item.quantidade -= qtd;

        return repo.save(item);
    }

}

/* ==================== CONTROLLER ==================== */

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
class ItemController {

    private final ItemService service;

    ItemController(ItemService s){
        this.service = s;
    }

    /* ========== CRUD ========== */

    @GetMapping
    public List<Item> listar(){
        return service.listar();
    }

    @PostMapping
    public Item criar(@RequestBody Item item){
        return service.salvar(item);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> buscar(@PathVariable Long id){
        return service.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> atualizar(@PathVariable Long id, @RequestBody Item novo){
        return service.buscar(id).map(item -> {
            item.nome = novo.nome;
            item.categoria = novo.categoria;
            item.localArmazenamento = novo.localArmazenamento;
            item.quantidade = novo.quantidade;
            item.quantidadeMinima = novo.quantidadeMinima;
            item.ultimaEntrada = novo.ultimaEntrada;

            return ResponseEntity.ok(service.salvar(item));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    /* ========== ENTRADA MATERIAL ========== */
    @PutMapping("/{id}/entrada")
    public ResponseEntity<?> entrada(@PathVariable Long id, @RequestParam int quantidade){
        try{
            return ResponseEntity.ok(service.entrada(id, quantidade));
        } catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    /* ========== SAÍDA MATERIAL ========== */
    @PutMapping("/{id}/saida")
    public ResponseEntity<?> saida(@PathVariable Long id, @RequestParam int quantidade){
        try{
            return ResponseEntity.ok(service.saida(id, quantidade));
        } catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
