package AdvancedJava.SetsAndMapsAdvanced;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class E07AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap <String,Double> studentsMap = new TreeMap<>();

        for (int i = 0; i < n ; i++) {
            String name = scanner.nextLine();
            double scores = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).average().getAsDouble();

           if (!studentsMap.containsKey(name)){
               studentsMap.putIfAbsent(name,scores);

           }else{
               System.out.printf("%s is graduated with %s%n",name,scores);
           }


        }
        DecimalFormat dec = new DecimalFormat("#.########################");
        studentsMap.forEach((k,v)-> System.out.printf("%s is graduated with %s%n",k,dec.format(v) ) );

    }
}
