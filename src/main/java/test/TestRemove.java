package test;

import model.Book;
import repository.BookRepository;
import repositoryImpl.BookRepositoryImpl;

public class TestRemove {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        Book book = bookRepository.find(104);

        bookRepository.delete(book);

    }
}
