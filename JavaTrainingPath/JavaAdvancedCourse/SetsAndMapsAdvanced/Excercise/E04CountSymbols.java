package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <Character, Integer> symbolsAndCount = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i <input.length() ; i++) {
            char current = input.charAt(i);
            symbolsAndCount.putIfAbsent(current,0);
            symbolsAndCount.put(current, symbolsAndCount.get(current)+1);

        }

        for (Map.Entry<Character,Integer>entry : symbolsAndCount.entrySet() ) {
            System.out.println(entry.getKey()+": "+entry.getValue()+" time/s");

        }

    }
}
