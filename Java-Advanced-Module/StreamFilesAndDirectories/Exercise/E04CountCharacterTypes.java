package AdvancedJava.StreamFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E04CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String input = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/input.txt";
        String output = "src/AdvancedJava/StreamFilesAndDirectories/Exercise/Resources/outputExcrs.txt";

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> punctuation = List.of('(', '!', ',', '.', '?', ')');

        int consonantsCount=0 , vowelsCount=0 , punctuationsCount = 0;

        BufferedReader reader = Files.newBufferedReader(Path.of(input));

        String s;
        while((s=reader.readLine()) != null){

            for (int i = 0; i < s.length() ; i++) {
                char current = s.charAt(i);

                if(vowels.contains(current)){
                    vowelsCount++;
                }else if(punctuation.contains(current)){
                    punctuationsCount++;
                }else if(current!=' '){
                    consonantsCount++;
                }


            }

        }
        Files.writeString(Path.of(output),String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowelsCount,consonantsCount,punctuationsCount));

        reader.close();
    }
}
