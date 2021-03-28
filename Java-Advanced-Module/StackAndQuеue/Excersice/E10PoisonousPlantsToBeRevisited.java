package AdvancedJava.StackAndQuеue.Excersice;

import java.util.*;

public class E10PoisonousPlantsToBeRevisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> plants = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            plants.put(i, input[i]);
        }

        ArrayDeque<Integer> indexOfDead = new ArrayDeque<>();

        int days = 0;

        if (plants.size() > 1) {

            while (true) {

                int[] keySet = plants.keySet().stream().mapToInt(e -> e).toArray();


                for (int i = 0; i < keySet.length-1; i++) {

                    int plantLeft = plants.get(keySet[i]);

                    int plantRight = plants.get(keySet[i+1]);

                    if (plantLeft < plantRight) {
                        indexOfDead.push(keySet[i+1]);
                    }


                }

                if (indexOfDead.isEmpty()) {
                    break;
                } else {
                    while (!indexOfDead.isEmpty()) {
                        plants.remove(indexOfDead.pop());
                    }
                    days++;
                }
            }

        }
        System.out.println(days);
    }
}
