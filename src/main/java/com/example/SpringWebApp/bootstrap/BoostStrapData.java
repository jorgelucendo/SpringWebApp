package com.example.SpringWebApp.bootstrap;

import com.example.SpringWebApp.domain.Author;
import com.example.SpringWebApp.domain.Book;
import com.example.SpringWebApp.domain.Publisher;
import com.example.SpringWebApp.repositories.AuthorRepository;
import com.example.SpringWebApp.repositories.BookRepository;
import com.example.SpringWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BoostStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BoostStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Jhonson");
        Book noEJB = new Book("J2EE Development without EJB","3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Boostrap");
        System.out.println("Number of books: "+bookRepository.count());

        Publisher pub = new Publisher("C/Campana 167","Cenicero","Spain","20XXX");

        publisherRepository.save(pub);
    }
}
