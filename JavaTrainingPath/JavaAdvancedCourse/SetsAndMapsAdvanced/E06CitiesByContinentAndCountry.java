package JavaAdvancedCourse.SetsAndMapsAdvanced;

import java.util.*;

public class E06CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        while (n-- >0){
            String [] input = scanner.nextLine().split("\\s+");

            map.putIfAbsent(input[0], new LinkedHashMap<>());
            map.get(input[0]).putIfAbsent(input[1],new ArrayList<>());
            map.get(input[0]).get(input[1]).add(input[2]);
        }


        map.entrySet().forEach(e->{
            System.out.println(e.getKey()+":");
            e.getValue().entrySet().forEach(c ->{
                System.out.printf("  %s -> ",c.getKey());
                System.out.print(c.getValue().toString().replaceAll("[\\[\\]]", ""));
                System.out.println();
            });


        });


    }
}
