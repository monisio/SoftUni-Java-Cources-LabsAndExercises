package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E02SumBytes {

    public static void main(String[] args) throws IOException {
        String path = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            long sum = 0;
            int a;
            while ((a = reader.read()) != -1) {
                sum += a;

            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Втори вариант ,но може би има и по-лесен начин.
        byte[] bytes = Files.readAllBytes(Path.of(path));
        long sumOfBytes = 0;
        for (byte aByte : bytes) {
            sumOfBytes+= aByte;
        }
        System.out.println(sumOfBytes);

    }
}
