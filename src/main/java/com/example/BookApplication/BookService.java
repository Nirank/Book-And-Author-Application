package com.example.BookApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  //  @Autowired
    BookRepository bookRepository = new BookRepository();
    public String addBook(Book book){
        return bookRepository.addBook(book);
    }
    public String addAuthor(Author author) {
       return bookRepository.addAuthor(author);
    }

    public String highestPages() {
        return bookRepository.highestPages();
    }

    public String updatePages(String name, int pages) {
        return bookRepository.updatepages(name , pages);
    }
}
