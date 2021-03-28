package JavaFundamentalsCourse.MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String message = tokens[1];
            int index = chat.indexOf(message);

            switch (command) {
                case "Chat":
                    chat.add(message);
                    break;
                case "Delete":
                    if (index > -1) {
                        chat.remove(index);
                    }

                    break;
                case "Edit":

                    if (index > -1) {
                        String newMessage = tokens[2];
                        chat.set(index, newMessage);
                    }
                    break;
                case "Pin":
                    if (index > -1) {
                        String current = chat.get(index);
                        chat.remove(index);
                        chat.add(current);
                    }
                    break;
                case "Spam":

                    for (int i = 1; i < tokens.length; i++) {
                        chat.add(tokens[i]);
                    }
                    break;


            }


            input = scanner.nextLine();
        }

        for (String message : chat) {
            System.out.println(message);

        }
    }
}
