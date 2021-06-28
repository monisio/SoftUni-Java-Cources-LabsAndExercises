package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.core.commands;

import JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.barracksWars.interfaces.Executable;

public abstract class Command implements Executable {

   private String [] data;


   protected Command(String[] data ){

        this.data= data ;

   }


   protected String[] getData(){
       return this.data;
   }
}
