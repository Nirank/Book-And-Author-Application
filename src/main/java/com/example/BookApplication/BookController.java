package com.example.BookApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {


   // @Autowired
    BookService bookService = new BookService();


    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book){
        String newbook = bookService.addBook(book);
        return new ResponseEntity<>(newbook, HttpStatus.CREATED);
    }


    @PostMapping("/addAuthor")
    public  String addAuthor(@RequestBody Author author){
        return bookService.addAuthor(author);
    }
    @GetMapping("/getBook")
    public String highestPages( ){
        return bookService.highestPages();
    }
    @PutMapping("/update")
    public String updatePages( String name, int pages){
        return bookService.updatePages(name, pages);
    }




}
