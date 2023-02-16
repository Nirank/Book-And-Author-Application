package com.example.BookApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}


/*

Create an author and book management system which can help us easily to perform CRUD operations.POST :Add book(been there),
add author GET : the bookName with highest no. of pages. PUT the (path bookname, updated pages);
 */