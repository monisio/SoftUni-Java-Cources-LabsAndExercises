package Fundamentals.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> playerOneDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwoDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (!(playerOneDeck.isEmpty() || playerTwoDeck.isEmpty())) {

            int playerOneCard = playerOneDeck.get(0);
            int playerTwoCard = playerTwoDeck.get(0);
            playerOneDeck.remove(0);
            playerTwoDeck.remove(0);

            if (playerOneCard > playerTwoCard) {

                playerOneDeck.add(playerOneCard);
                playerOneDeck.add(playerTwoCard);


            } else if (playerOneCard < playerTwoCard) {

                playerTwoDeck.add(playerTwoCard);
                playerTwoDeck.add(playerOneCard);

            }

        }

        String output = "";
        int sum = 0;

        if (playerOneDeck.isEmpty()){

            for (int i = 0; i < playerTwoDeck.size() ; i++) {
                sum += playerTwoDeck.get(i);
            }
            output= String.format( "Second player wins! Sum: %d",sum);
        }else {

            for (int i = 0; i < playerOneDeck.size() ; i++) {
                sum += playerOneDeck.get(i);
            }
            output= String.format( "First player wins! Sum: %d",sum);
        }


        System.out.println(output);

    }
}
