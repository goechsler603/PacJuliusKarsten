package com.pac.pacjulius.repositories;

import com.pac.pacjulius.entities.Item;
import com.pac.pacjulius.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> id(Long id);
}
