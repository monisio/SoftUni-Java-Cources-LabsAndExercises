package JavaAdvancedCourse.Generics.E07GenericCountMethod;

import JavaAdvancedCourse.Generics.E05GenericBox.Box;

import java.util.List;

public class Compare {

    public static <T extends Comparable<T>> int countOfSimilar(List<Box<T>> list, T element) {

        int count = 0;

        for (Box<T> t : list) {
           if( t.compareTo(element)>0){
               count++;
           }
        }


        return count;

    }



}
