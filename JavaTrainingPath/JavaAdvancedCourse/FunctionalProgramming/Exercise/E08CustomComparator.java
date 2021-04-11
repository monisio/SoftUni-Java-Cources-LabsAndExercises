package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        Comparator<Integer> comparator = (num1 , num2) ->{
                if(num1 %2 ==0 && num2 % 2 != 0){
                    return -1;
                }else if(num1 % 2 !=0 && num2 % 2 ==0){
                    return 1;
                }

                return num1.compareTo(num2);
        };




       System.out.println(input.stream().sorted(comparator).map(String::valueOf).collect(Collectors.joining(" ")));

    }



  /*public static  Function<List<Integer>, List<Integer>> comparator = list -> {

        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());

        collect.addAll(list.stream().filter(n -> n % 2 != 0).sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList()));

        return collect;
    };*/
}