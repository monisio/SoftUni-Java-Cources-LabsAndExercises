package JavaAdvancedCourse.IteratorsAndComparators.E01Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String name;
    private int year;
    private List<String> authors;


    public Book(String name, int year, String... authors) {
        this.setName(name);
        this.setYear(year);
        this.setAuthors(authors);

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }
}
