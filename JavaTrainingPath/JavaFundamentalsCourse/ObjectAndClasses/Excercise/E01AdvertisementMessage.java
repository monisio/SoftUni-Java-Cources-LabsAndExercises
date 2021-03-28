package JavaFundamentalsCourse.ObjectAndClasses.Excercise;

import java.util.Random;
import java.util.Scanner;

public class E01AdvertisementMessage {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String [] phrases = new String[]{"Excellent product.","Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String [] events = new String[]{"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] authors = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        for (int i = 0; i < n ; i++) {
            Random rnd = new Random();

            System.out.printf("%s %s %s - %s%n", phrases[rnd.nextInt(phrases.length)],events[rnd.nextInt(events.length)],authors[rnd.nextInt(authors.length)],cities[rnd.nextInt(cities.length)]);


        }



    }
}
