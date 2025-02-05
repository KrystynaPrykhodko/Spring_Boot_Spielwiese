package com.example.spielwiese;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController  // Wichtig: Diese Annotation muss vorhanden sein
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/api/books")  // Der Endpunkt muss korrekt gemappt sein
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}

