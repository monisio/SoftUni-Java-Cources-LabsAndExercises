package JavaAdvancedCourse.Generics.E09CustomListSorter;

import JavaAdvancedCourse.Generics.E08GenericCustomList.CustomList;

import java.util.Collections;

public class ListSorter {

   public static <T extends Comparable<T>> void sort(CustomList<T> list){
      Collections.sort(list.getElements());

   }

}
