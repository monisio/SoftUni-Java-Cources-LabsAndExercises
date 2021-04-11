package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Integer> inputDividers = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        List<Integer> result = new ArrayList<>();

        Predicate<Integer> predicate = num -> {

            for (Integer divider : inputDividers) {
                if (num % divider != 0) {
                    return false;
                }
            }
            return true;
        };


        for (int i = 1; i <= n; i++) {

            if(predicate.test(i)){
                result.add(i);
            }

        }

        result.forEach(e-> System.out.print(e+" "));


    }


}
