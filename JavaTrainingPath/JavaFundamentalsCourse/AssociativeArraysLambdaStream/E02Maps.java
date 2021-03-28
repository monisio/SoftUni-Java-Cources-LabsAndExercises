package JavaFundamentalsCourse.AssociativeArraysLambdaStream;

import java.util.*;

public class E02Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> currentWord = synonyms.get(word);
            //If there no list with named as word that we are looking for, then we will make the list and put it into map.
            if (currentWord == null){
                currentWord = new ArrayList<>();
                synonyms.put(word , currentWord);
            }

           // synonyms.get(word).add(synonym);  ---- this way its adding the information.
            currentWord.add(synonym);


        }

        for (Map.Entry<String , List<String>> entry :synonyms.entrySet()){
            List<String> value = entry.getValue();

            System.out.println(entry.getKey()+ " - "  + String.join(", " ,value) );
        }

    }
}
