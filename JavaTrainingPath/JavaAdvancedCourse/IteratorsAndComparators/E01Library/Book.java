package JavaAdvancedCourse.IteratorsAndComparators.E01Library;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String name, int year, String... authors) {
        this.setTitle(name);
        this.setYear(year);
        this.setAuthors(authors);

    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
            this.authors= Arrays.asList(authors);

    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }


    @Override
    public int compareTo(Book other) {
            int result = this.title.compareTo(other.title);
            return result !=0 ? result : Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}
