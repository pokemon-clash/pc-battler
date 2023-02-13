package it.pokemonclash.pcbattler.repositories;

import it.pokemonclash.pcbattler.entities.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
