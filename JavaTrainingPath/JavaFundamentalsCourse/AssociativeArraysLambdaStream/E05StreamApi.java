package JavaFundamentalsCourse.AssociativeArraysLambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05StreamApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((a,b) -> a.compareTo(b)).limit(3).collect(Collectors.toList());

        input.forEach(e-> System.out.print(e+" "));
    }
}
