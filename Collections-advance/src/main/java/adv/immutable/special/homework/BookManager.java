package adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> listOfBooks = new ArrayList<>();

    public Book createBook(String author, String title) {
        Book book = new Book(author, title);
        if (listOfBooks.contains(book)) {
            System.out.println("Podana ksiazka juz znajduje sie w kolekcji");
        } else {
            listOfBooks.add(book);
        }
        return book;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }
}
