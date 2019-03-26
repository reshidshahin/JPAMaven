package test;

import model.Book;
import repository.BookRepository;
import repositoryImpl.BookRepositoryImpl;

public class TestUpdate {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        Book book = bookRepository.find(101);
        book.setName("Çərpələng Uçuran");
        bookRepository.update(book);
    }
}
