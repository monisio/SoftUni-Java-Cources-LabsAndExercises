package JavaAdvancedCourse.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class E03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> deckTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));



        for (int i = 0; i < 50; i++) {

            if (deckOne.isEmpty()||deckTwo.isEmpty()) {
                break;
            }


            int one = deckOne.iterator().next();
            int two = deckTwo.iterator().next();
            deckOne.remove(one);
            deckTwo.remove(two);


            if (one > two) {
                deckOne.add(one);
                deckOne.add(two);

            } else if(two>one){
                deckTwo.add(one);
                deckTwo.add(two);
            }



        }
        String output = "";
        if (deckOne.size()>deckTwo.size()) {
          output="First player win!";
        }else if(deckTwo.size()>deckOne.size()){
            output="Second player win!";
        }else{
            output= "Draw!";
        }

        System.out.println(output);
    }
}
