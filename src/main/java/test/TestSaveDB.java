package test;


import model.Book;
import repository.BookRepository;
import repositoryImpl.BookRepositoryImpl;

import java.util.Calendar;
import java.util.Date;

public class TestSaveDB {
    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        Book book1 = new Book(100, "Harry Poter", 250, "Bilim Kurgu", "Shahin Rashidsoy", calendar(1995, 04, 23));
        Book book2 = new Book(101, "Cerpeleng Ucuran", 350, "Roman", "Xalid Huseyni", calendar(2006, 12, 15));
        Book book3 = new Book(102, "Min Mohtesem Gunes Altinda", 120, "Roman", "Xalid Huseyni", calendar(2009, 02, 4));
        Book book4 = new Book(103, "M.K.A", 500, "Tarix", "Yilmaz Ozdil", calendar(2016, 15, 15));
        Book book5 = new Book(104, "Melikmemmed", 350, "Nagil", "BilmiremKim", calendar(2022, 12, 15));
        Book book6 = new Book(105, "Homosapiens", 302, "Non-fiction", "Yuval Noah Harari", calendar(2076, 01, 05));


        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);
        bookRepository.save(book5);
        bookRepository.save(book6);
    }

    public static Date calendar(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        return calendar.getTime();
    }
}
