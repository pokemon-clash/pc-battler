package it.pokemonclash.pcbattler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import it.pokemonclash.pcbattler.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNickname(String nickname);
}