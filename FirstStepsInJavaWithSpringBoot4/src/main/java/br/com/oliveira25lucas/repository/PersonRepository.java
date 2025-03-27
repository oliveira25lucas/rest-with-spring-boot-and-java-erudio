package br.com.oliveira25lucas.repository;

import br.com.oliveira25lucas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}

