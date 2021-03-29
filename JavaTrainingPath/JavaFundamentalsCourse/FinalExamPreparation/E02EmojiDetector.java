package JavaFundamentalsCourse.FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        long coolThreshold = getCoolThreshold(input);


        Pattern findEmoji = Pattern.compile("([:|*]{2})(?<letters>[A-Z]{1}[a-z]{2,})\\1");
        Matcher matcher = findEmoji.matcher(input);

        Map<String, Integer> emojis = new LinkedHashMap<>();

        while (matcher.find()) {
            String emoji = matcher.group();

            int sum = matcher.group("letters").chars().sum();

            emojis.putIfAbsent(emoji, sum);
        }

        List <String> coolOnes = new ArrayList<>();

        emojis.forEach((key, value) -> {
            if (value >= coolThreshold) {
                coolOnes.add(key);
            }
        });

        if (!coolOnes.isEmpty()) {

            System.out.println("Cool threshold: " + coolThreshold);
            System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");
            coolOnes.forEach(System.out::println);

        }

    }

    private static long getCoolThreshold(String input) {
        long result = 1;

        Pattern thresholdPattern = Pattern.compile("[\\d]");

        Matcher matcher = thresholdPattern.matcher(input);

        while (matcher.find()) {
            long multiplier = Integer.parseInt(matcher.group());
            result *= multiplier;

        }

        return result;
    }
}
