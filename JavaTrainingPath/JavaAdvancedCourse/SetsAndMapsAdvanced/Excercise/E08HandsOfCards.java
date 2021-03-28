package JavaAdvancedCourse.SetsAndMapsAdvanced.Excercise;

import java.util.*;

public class E08HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character , Integer> special = new HashMap();

        String specialSigns = "JQKA";
        for (int i = 0; i < 4 ; i++) {
            special.put(specialSigns.charAt(i), i+11);
        }
        String multipliers = "CDHS";
        Map<Character, Integer> multiplier = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            multiplier.put(multipliers.charAt(i), i+1 );
        }

        Map<String, Set<String>> deckHands = new LinkedHashMap<>();

        String input = scanner.nextLine();


        while (!input.contains("JOKER")){
            String [] inputArray = input.split(":");
            String name = inputArray[0];
            String [] card = inputArray[1].trim().split(", ");

            deckHands.putIfAbsent(name, new HashSet<>());
            deckHands.get(name).addAll(Arrays.asList(card));


            input = scanner.nextLine();
        }
        if(!deckHands.isEmpty()){

            for (Map.Entry<String, Set<String>> playerHand : deckHands.entrySet()) {

                Set<String> deck = playerHand.getValue();
                int sum = 0;
                for (String s : deck) {

                    int p ;
                    int m = multiplier.get(s.charAt(s.length()-1));
                    if(Character.isDigit(s.charAt(0))){
                        p = Integer.parseInt(s.substring(0,s.length()-1));
                    }else{
                        p= special.get(s.charAt(0));
                    }
                    sum  += p*m;
                }

                System.out.println(playerHand.getKey()+": "+sum);

            }
        }

    }
}
