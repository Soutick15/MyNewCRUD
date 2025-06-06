package com.example.MyNewCRUD.controller;

import com.example.MyNewCRUD.model.MyBooks;
import com.example.MyNewCRUD.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<MyBooks> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public void addNewBooks(@RequestBody MyBooks books){
        bookService.addNewBooks(books);

    }

    @PutMapping("/{id")
    public void updateBookById(@PathVariable int id, @RequestBody MyBooks books){
        bookService.updateBookById(id, books);

    }

    @DeleteMapping("/{id}")
    public void deleteBooksById(@PathVariable int id){
        bookService.deleteBooksById(id);
    }

}
