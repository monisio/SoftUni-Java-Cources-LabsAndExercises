package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E03Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake<Integer> implements Iterable<Integer> {

    private List<Integer> lake;


    public Lake() {
        this.lake = new ArrayList<>();
    }



    public void add(Integer value){
       this.lake.add(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {

       private int counter = 0;
       private final int lastEvenIndex = lake.size()%2==0 ?  lake.size()-2 : lake.size()-1;


        @Override
        public boolean hasNext() {
            return counter < lake.size();
        }

        @Override
        public Integer next() {
             if(counter==lastEvenIndex){
                 counter=1;
                 return lake.get(lastEvenIndex);
             }
             int index = counter;
             counter+=2;
             return lake.get(index);
        }


    }

}

