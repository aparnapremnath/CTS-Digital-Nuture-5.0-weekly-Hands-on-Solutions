package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Loading Spring Application Context ===");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring Context loaded successfully!\n");

        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("--- Testing BookService ---");
        bookService.addBook("Clean Code by Robert C. Martin");
        System.out.println();
        bookService.getBook(1);

        System.out.println("\n=== Application Finished ===");

        ((ClassPathXmlApplicationContext) context).close();
    }
}