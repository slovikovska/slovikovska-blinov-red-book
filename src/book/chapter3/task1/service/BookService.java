package book.chapter3.task1.service;

import book.chapter3.task1.model.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookService {

    public static List<Book> findBooksByAuthor(List<Book> books, String author) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> findByAuthor = books.iterator();
        while (findByAuthor.hasNext()) {
            Book book = findByAuthor.next();
            if (book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }

    public static List <Book> findBooksByPublisher(List <Book> books, String publisher) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> findByPublisher = books.iterator();
        while (findByPublisher.hasNext()) {
            Book book = findByPublisher.next();
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }
    public static List<Book> findBooksByYear(List<Book> books, int year) {
        List<Book> result = new ArrayList<>();
        Iterator<Book> findByYear = books.iterator();
        while(findByYear.hasNext()) {
            Book book = findByYear.next();
            if(book.getYearBookPublished() <= year) {
                result.add(book);
            }
        }
        return result;
    }
}
