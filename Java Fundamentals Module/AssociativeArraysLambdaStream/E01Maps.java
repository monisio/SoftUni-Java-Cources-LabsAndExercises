package Fundamentals.AssociativeArraysLambdaStream;

import java.text.DecimalFormat;
import java.util.*;

public class E01Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map <Double, Integer > counts = new TreeMap<>();

        for (double number : input){
             //option one slowed that option two
            counts.putIfAbsent(number, 0);

            counts.put(number, counts.get(number)+1);

            //Option two faster but with longer syntax
            //            if (counts.get(number)== null){
//                counts.put(number, 1);
//            }else{
//                counts.put(number, counts.get(number) + 1);
//            }

        }

       // counts.forEach(e -> System.out.println(e.getKey()+" "+ e.getValue()));

        for (Map.Entry <Double,Integer> entry : counts.entrySet()){
            DecimalFormat df = new DecimalFormat("#.######");

            System.out.println(df.format(entry.getKey())+" -> "+ df.format(entry.getValue()));

        }



    }
}
