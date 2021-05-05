package JavaAdvancedCourse.IteratorsAndComparators.E01Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book("name", 2020 , "Al kapone", "Tuto di tuti capi");
        Book book1 = new Book("new book", 2020 , "Al kapone");
        Book book2 = new Book("Conan", 2020 , "Al kapone, and friends");

        library.addBooks(book , book1 , book2);


        library.forEach(e -> System.out.println(e.getName()));

        for (Book b : library) {
            System.out.println(b.getName());
        }

    }
}
