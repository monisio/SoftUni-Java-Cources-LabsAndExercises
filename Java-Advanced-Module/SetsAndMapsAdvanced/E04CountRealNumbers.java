package AdvancedJava.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> map = new LinkedHashMap<>();


        for (double n : input) {

            map.putIfAbsent(n, 0);
            map.put(n,map.get(n)+1);

        }
//entry set to reach both key and values in map
        map.entrySet().forEach(e-> System.out.println(String.format( "%.1f -> %d",e.getKey(),e.getValue())));




    }
}
