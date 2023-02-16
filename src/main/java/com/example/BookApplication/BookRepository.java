package com.example.BookApplication;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    HashMap< String, Book> bookMap= new HashMap<>();
    HashMap<String, Author> authorMap = new HashMap<>();

    public String addBook(Book book) {
        String bookName = book.getBname();
        if(bookMap.containsKey(bookName))
            return  "Book already present";
        bookMap.put(bookName, book);
        return "BOOK ADDED SUCCESSFULLY";
    }
    public String addAuthor(Author author) {
        String authorName = author.getaName();
        if(authorMap.containsKey(authorName))
            return  "Author already present";
        authorMap.put(authorName, author);
        return "Author ADDED SUCCESSFULLY";
    }

    public String highestPages() {
        String bookWithHighestPages = "";
        int max=0;
        for(String s : bookMap.keySet()){
            Book currBook = bookMap.get(s);
            if( currBook.getPages() > max){
                max = currBook.getPages();
                bookWithHighestPages=currBook.getBname();
            }

        }
        return bookWithHighestPages;
    }

    public String updatepages(String name, int pages) {
        Book curr = bookMap.get(name);

        int currPage = curr.getPages();
        bookMap.get(name).setPages(currPage+pages);
        return "Pages Added SuccessFully";

    }
}
