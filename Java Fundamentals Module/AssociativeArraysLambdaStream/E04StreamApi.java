package Fundamentals.AssociativeArraysLambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04StreamApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variant 1 - stream must initiate the array in order to store it , otherwise the stream remains an object (happens only to arrays).
        //String [] input = Arrays.stream(scanner.nextLine().split(" ")).filter(e-> e.length()%2==0).toArray(String[]::new);

        //Variant 2 - stream is used on list , thus there is no need to initiate as in Array case , it only needed resulting stream Object to be collected as list.
        List<String> input  = Arrays.stream(scanner.nextLine().split(" ")).filter(e-> e.length()%2==0).collect(Collectors.toList());

        //example of usage of forEach on list result
        input.forEach(System.out::println);

    }
}
