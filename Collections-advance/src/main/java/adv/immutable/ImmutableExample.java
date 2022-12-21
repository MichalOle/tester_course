package adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("Adam", "Mickiewicz");
        BookHacked book1 = new BookHacked("Adam", "Mickiewicz");
        book1.modifyTitle("Adamek");
        System.out.println(book1.getTitle());


        // Obejście niemutualności
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("New Title");
        System.out.println(book.title);


    }
}
