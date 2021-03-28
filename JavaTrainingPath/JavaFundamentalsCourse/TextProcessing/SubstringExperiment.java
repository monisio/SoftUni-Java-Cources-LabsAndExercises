package JavaFundamentalsCourse.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
        String inputString = scanner.nextLine();



        while  (inputString.indexOf(word)!=-1){

            int startIndex = 0;
            int endIndex = inputString.indexOf(word, startIndex);
            List<String> result = new ArrayList<>();

            while (endIndex != -1){
                String partOfInput = inputString.substring(startIndex, endIndex);
                result.add(partOfInput);

                startIndex = endIndex + word.length();
                endIndex= inputString.indexOf(word, startIndex);
            }

            String leftFromInput = inputString.substring(startIndex);  // this way we are taking everything left in string after the pointed index

            result.add(leftFromInput);

            inputString =  String.join("",result);  // String.join always require delimiter parameter in arguments

        }

        System.out.println(inputString);
    }
}
