package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E03Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake<Integer> implements Iterable<Integer> {

    private List<Integer> lake;


    public Lake(Integer... args) {
        this.lake = new ArrayList<>(Arrays.asList(args));
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    public class Frog implements Iterator<Integer> {

       private int counter = 0;




        @Override
        public boolean hasNext() {
            return ;
        }

        @Override
        public Integer next() {
          return ;

        }

        @Override
        public void remove() {

        }


    }

}

