package com.example.MyNewCRUD.service;

import com.example.MyNewCRUD.model.MyBooks;
import com.example.MyNewCRUD.model.MyBooks;
import com.example.MyNewCRUD.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public List<MyBooks> getAllBooks() {
      return bookRepository.findAll();

    }

    public void addNewBooks(MyBooks book) {
        bookRepository.save(book);
    }


    public void updateBookById(int id, MyBooks books) {
        MyBooks book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        book.setId(books.getId());
        book.setName(books.getName());
        book.setPrice(books.getPrice());

        bookRepository.save(book);
    }
    public void deleteBooksById(int id) {
        bookRepository.deleteById(id);
    }
}
