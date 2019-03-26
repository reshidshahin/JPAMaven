package test;

import model.Book;
import repository.BookRepository;
import repositoryImpl.BookRepositoryImpl;

public class TestFind {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        Book book1 = bookRepository.find(100);
        Book book2 = bookRepository.find(101);
        Book book3 = bookRepository.find(102);
        Book book4 = bookRepository.find(103);
        Book book5 = bookRepository.find(104);

        if (book1 != null || book2 != null) {
            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            System.out.println(book4);

        } else {
            System.out.println("Books not found..");
        }
    }
}
