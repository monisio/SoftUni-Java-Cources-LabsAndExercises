package JavaFundamentalsCourse.FinalExamPreparation;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        BigInteger coolThreshold = getCoolThreshold(input);
        //([:|*]{2})(?<letters>[A-Z]{1}[a-z]{2,})\1

        Pattern findEmoji = Pattern.compile("(:{2}|\\*{2})(?<letters>[A-Z]{1}[a-z]{2,})\\1");
        Matcher matcher = findEmoji.matcher(input);

        List<String> coolOnes = new ArrayList<>();

        int counter = 0;
        while (matcher.find()) {
            counter++;
            int sum = matcher.group("letters").chars().sum();

            if (coolThreshold.compareTo(BigInteger.valueOf(sum)) <= 0) {
                coolOnes.add(matcher.group());
            }

        }


        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(counter + " emojis found in the text. The cool ones are:");

        if (!coolOnes.isEmpty()) {

            coolOnes.forEach(System.out::println);

        }


    }

    private static BigInteger getCoolThreshold(String input) {

        BigInteger result = new BigInteger("1");

        Pattern thresholdPattern = Pattern.compile("\\d");
        Matcher matcher = thresholdPattern.matcher(input);
        while (matcher.find()) {


            result = result.multiply(BigInteger.valueOf(Integer.parseInt(matcher.group())));


        }

        return result;
    }
}
