package Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("Report")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];
            String token = tokens[1];

            if (command.equals("Blacklist")) {
                int index = friendsList.indexOf(token);
                if (index > -1) {
                    String current = friendsList.get(index);
                    friendsList.set(index, "Blacklisted");
                    System.out.println(current+" was blacklisted.");
                } else {
                    System.out.println(token + " was not found.");
                }
            } else if (command.equals("Error")) {
                int index = Integer.parseInt(token);
                if(index>=0&&index<=friendsList.size()){
                    String current = friendsList.get(index);

                    if (!current.equals("Blacklisted") && !current.equals("Lost")) {
                        friendsList.set(index, "Lost");
                        System.out.println(current+" was lost due to an error.");
                    }
                }


            }else if (command.equals("Change")){
                int index = Integer.parseInt(token);
                String newName = tokens[2];
                if(index>=0&& index< friendsList.size()){
                    String oldName = friendsList.get(index);
                    friendsList.set(index, newName);

                    System.out.printf("%s changed his username to %s.%n", oldName,newName);


                }

            }

            input = scanner.nextLine();
        }


        int blacklistedCount = 0;
        int lostCount = 0;

        for (String names : friendsList) {
            if (names.equals("Blacklisted")){
                blacklistedCount++;
            }else if (names.equals("Lost")){
                lostCount++;
            }

        }

        System.out.printf("Blacklisted names: %d%nLost names: %d%n",blacklistedCount, lostCount);

        System.out.println(friendsList.toString().replaceAll("[\\[\\],]", ""));

    }

}
