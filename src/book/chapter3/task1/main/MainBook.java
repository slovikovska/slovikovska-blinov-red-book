package book.chapter3.task1.main;

import book.chapter3.task1.model.Book;
import book.chapter3.task1.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        // id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета

        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "Gone With the Wind", "Margaret Mitchel", "Macmillan", 1929, 400L, 20, "7"));
        books.add(new Book(2, "The Last of the Mohicans", "James F. Cooper", "Macmillan", 1990, 240L, 15, "5"));
        books.add(new Book(3, "Pollyanna", "Sophie Scott", "Longman", 2001, 320L, 20, "5"));
        books.add(new Book(4, "Thalamus's Letters", "C.S.Lewis", "Oxford University Press", 1998, 120L, 45, "5"));
        books.add(new Book(5, "Barren And Luthien", "J.R.R.Tolkien", "Penguin", 1999, 580L, 80, "7"));
        books.add(new Book(6, "My Life", "Henry Ford", "Independent", 1935, 220L, 45, "8"));
        books.add(new Book(7, "The Deerslayer", "James F. Cooper", "Macmillan", 1999, 200L, 15, "5"));
        books.add(new Book(8, "The Spy", "James F. Cooper", "Macmillan", 1988, 280L, 10, "5"));
        books.add(new Book(9, "The Horse And His Boy", "C.S.Lewis", "Penguin", 1999, 490L, 40, "7"));

        System.out.println(BookService.findBooksByAuthor(books, "C.S.Lewis"));
        System.out.println(BookService.findBooksByPublisher(books, "Penguin"));
        System.out.println(BookService.findBooksByYear(books, 1990));

    }
}
