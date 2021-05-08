package JavaAdvancedCourse.IteratorsAndComparators.E02Comparator;

import JavaAdvancedCourse.IteratorsAndComparators.E01Library.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override

    public int compare(Book one, Book two) {
         int result = one.getTitle().compareTo(two.getTitle());

         return result !=0 ?  result : Integer.compare(one.getYear(), two.getYear());
    }
}
