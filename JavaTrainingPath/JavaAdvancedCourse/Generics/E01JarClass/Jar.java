package JavaAdvancedCourse.Generics.E01JarClass;


import java.util.ArrayList;
import java.util.List;

public class Jar <T> {

   private final List<T> containment;

   public Jar(){
     this.containment= new ArrayList<>();
   }

   public void add(T element){
       this.containment.add(element);

   }

   public T remove(){
      return containment.remove(this.containment.size()-1);
   }

}
