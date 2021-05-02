package JavaAdvancedCourse.Generics.E08GenericCustomList;

import JavaAdvancedCourse.Generics.E04ListUtils.ListUtils;
import JavaAdvancedCourse.Generics.E06GenericSwapMethod.SwapList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public List<T> getElements(){
        return this.elements;
    }

    public CustomList(){
       this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public T remove(int index){
      return this.elements.remove(index);
    }

    public boolean contains(T element){
        return elements.contains(element);
    }

    public void swap(int indexOne , int indexTwo){
        SwapList.swap(this.elements, indexOne,indexTwo);
    }

    public int countGreaterThan(T element){
        return (int) this.elements.stream().filter(e->e.compareTo(element)>0).count();

    }

    public T getMin(){
       return  ListUtils.getMin(this.elements);
    }

    public T getMax(){
        return  ListUtils.getMax(this.elements);
    }
}
