package com.example.SpringWebApp.repositories;

import com.example.SpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{
}
