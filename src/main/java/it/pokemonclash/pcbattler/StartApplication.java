package it.pokemonclash.pcbattler;

import it.pokemonclash.pcbattler.entities.User;
import it.pokemonclash.pcbattler.repositories.UserRepository;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    //private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {

        //log.info("StartApplication...");

        repository.save(new User("Pippo"));
        repository.save(new User("Node"));
        repository.save(new User("Python"));

        System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        System.out.println("\nfindById(1L)");
        repository.findById(1l).ifPresent(x -> System.out.println(x));

        System.out.println("\nfindByName('Node')");
        repository.findByNickname("Node").forEach(x -> System.out.println(x));

    }

}