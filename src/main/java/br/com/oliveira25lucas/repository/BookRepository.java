package br.com.oliveira25lucas.repository;

import br.com.oliveira25lucas.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}