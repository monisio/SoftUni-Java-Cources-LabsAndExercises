package JavaAdvancedCourse.IteratorsAndComparators.E01Library;

import JavaAdvancedCourse.IteratorsAndComparators.E02Comparator.BookComparator;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {


            Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
            Book bookThree = new Book("The Documents in the Case", 2002);
            Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

            Library library = new Library(bookOne, bookTwo, bookThree);


        // sorting with use of list.sort
        library.getBooks().sort(new BookComparator());

        // sorting with invocation on sort overload method using List and anonymous instance of comparator  .
        Collections.sort(library.getBooks(), new BookComparator());

        // Collections sort method with invoking every object compareTo of Comparable interface implementation on the object.
        Collections.sort(library.getBooks());


        for (Book book : library) {
            System.out.println(book);
        }
    }
}
