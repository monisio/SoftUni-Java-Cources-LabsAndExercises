package JavaAdvancedCourse.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine()
                .split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")){


            if(command.equals("print")){
                System.out.println(inputNumbers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            }else{

                 inputNumbers = inputNumbers.stream().map(getFunction(command)).collect(Collectors.toList());

            }



            command= scanner.nextLine();
        }



    }

    public static Function<Integer , Integer> getFunction(String factor){

        switch (factor){
            case "add":
                return n -> n+1;
            case "multiply":
                return n -> n*2;
            case "subtract":
                return n -> n-1;

            default:
                throw new IllegalStateException("Unexpected operation: " + factor);
        }


    }
}
