package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E01ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<String> implements Iterable<String> {

    private List<String> data;
    private int counter = 0;

    public ListyIterator(String... input) {
        this.data = Arrays.asList(input);
    }


    public boolean Move() {
        if (HasNext()) {
            this.counter++;
            return true;

        }
        return false;
    }


    public boolean HasNext() {
        return counter < data.size() - 1;
    }


    public void Print() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.data.get(counter));
    }

    public void PrintAll() {
        for (String string : this) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return this.counter < data.size();
            }

            @Override
            public String next() {
                return data.get(this.counter++);
            }
        };
    }
}

