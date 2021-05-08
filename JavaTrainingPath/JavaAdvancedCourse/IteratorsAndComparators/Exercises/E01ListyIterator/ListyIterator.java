package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E01ListyIterator;

import java.util.Arrays;
import java.util.List;

public class ListyIterator<String>  {

    private List<String> data;
    private int counter = 0;

    public ListyIterator(String... input) {
        this.data = Arrays.asList(input);
    }


    public boolean Move(){
       if(HasNext()){
           this.counter++;
           return true;

       }
        return false;
    }


    public boolean HasNext() {
        return counter < data.size()-1;
    }


    public void Print(){
         if(data.isEmpty()){
             throw new IllegalStateException("Invalid Operation!");
         }
        System.out.println(this.data.get(counter));
    }
}

