package com.bookstore.bookstore.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bookstore.bookstore.dto.FiltersDto;
import com.bookstore.bookstore.model.Book;
import com.bookstore.bookstore.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("")
    public List<Book> getAllBooks(@ModelAttribute FiltersDto filters) {
        Specification<Book> spec = Specification.where(null);

        if (filters.getId() != null) {
            spec = spec.and((root, query, cb) -> root.get("id").in(filters.getId()));
        }
        if (filters.getTitle() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("title"), "%" + filters.getTitle() + "%"));
        }
        if (filters.getDescription() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("description"), "%" + filters.getDescription() + "%"));
        }
        if (filters.getAuthor() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("author"), "%" + filters.getAuthor() + "%"));
        }
        if (filters.getGenre() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("genre"), "%" + filters.getGenre() + "%"));
        }
        if (filters.getFormat() != null) {
            spec = spec.and((root, query, cb) -> cb.like(root.get("format"), "%" + filters.getFormat() + "%"));
        }
        if (filters.getVolumes() != null) {
            spec = spec.and((root, query, cb) -> root.get("volumes").in(filters.getVolumes()));
        }

        return bookRepository.findAll(spec);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book book) {
    	System.out.println("qui");
        return bookRepository.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book bookData) {
        Book book = bookRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        
        book.setTitle(bookData.getTitle());
        book.setDescription(bookData.getDescription());
        book.setAuthor(bookData.getAuthor());
        book.setGenre(bookData.getGenre());
        book.setFormat(bookData.getFormat());
        book.setVolumes(bookData.getVolumes());
        book.setLastUpdate(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Long id) {
        bookRepository.deleteById(id);
    }
}