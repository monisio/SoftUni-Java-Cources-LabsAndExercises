package JavaOOPCourse.Inheritance.StackOfStrings;

import java.util.ArrayList;

public class Stack<String>  {

   private ArrayList<String> data ;

  public Stack(){
      this.data= new ArrayList<>();
  }

   public void push(String item){
      this.data.add(item);
   }

   public String peek(){
       if(this.isEmpty()){
           return null;
       }
       return this.data.get(this.data.size()-1);
   }

   public String pop(){
       if(this.isEmpty()){
           return null;
       }
       return this.data.remove(this.data.size()-1);
   }

   public boolean isEmpty(){
      return this.data.isEmpty();
   }

}
