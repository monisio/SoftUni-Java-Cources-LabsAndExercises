package AdvancedJava.SetsAndMapsAdvanced;

import java.util.*;

public class E05AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt( scanner.nextLine());

        Map <String , List<Double>> studentsGrades = new HashMap<>();

       while ( n-->0){
           String input = scanner.nextLine();
           String name = input.substring(0,input.indexOf(" "));
           double grade =Double.parseDouble(input.substring(input.indexOf(" ")+1));

           List<Double> currentGrade = studentsGrades.get(name);
           if (currentGrade==null){

               currentGrade= new ArrayList<>();
               studentsGrades.put(name, currentGrade);
           }

          currentGrade.add(grade);


       }

       studentsGrades.entrySet().forEach(e->{
           System.out.print(e.getKey()+" -> ");
           e.getValue().forEach(i-> System.out.printf( "%.2f ",i));
           System.out.printf("(avg: %.2f)%n", e.getValue().stream().mapToDouble(d->d).average().getAsDouble());
       });

    }
}
