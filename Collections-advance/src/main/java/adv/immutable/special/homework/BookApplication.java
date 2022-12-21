package adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book = new Book("A","B");
        Book book5 = new Book("A","B");
        Book book2 = bookManager.createBook("Adam Mickiewicz","Dziady");
        Book book3 = bookManager.createBook("Bolesaw Prus","Lalka");
        Book book4 = bookManager.createBook("Wiesawa Szymborska","Ferdydurke");
        // attemp add duplicate object to collection
        Book book6 = bookManager.createBook("Wiesawa Szymborska","Ferdydurke");


//        System.out.println(book2);
//        System.out.println(book.toString());
//        System.out.println(book3.toString());
//        System.out.println(book4.toString());

//        comparing addreses of objects
        System.out.println(book == book5);
        System.out.println(book.equals(book5));
        System.out.println("<------------->");
        System.out.println(book == book2);
        System.out.println("<------------->");
        System.out.println(book4.equals(book6));
        System.out.println(bookManager.getListOfBooks());


    }

    }

