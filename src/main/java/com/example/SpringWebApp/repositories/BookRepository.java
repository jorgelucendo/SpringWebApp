package com.example.SpringWebApp.repositories;

import com.example.SpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
