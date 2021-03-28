package AdvancedJava.StreamFilesAndDirectories;

import java.io.*;
import java.util.List;

public class E03CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\input";
        String outputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\output.txt";



        List<Character> lookUpTable = List.of(' ', '\n');

        try(FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(outputPath);
            InputStreamReader input = new InputStreamReader(fis);){
            int oneByte = input.read();

            while (oneByte > -1 ){

                if(lookUpTable.contains((char)oneByte)){ // трябва байт информацията да бъде превърната в char преди проверката иначе
                    // ще търси инт стойност в листа.

                    fos.write(oneByte);

                }else{
                    String line = String.valueOf(oneByte);
                    for (int i = 0; i < line.length() ; i++) {

                        fos.write(line.charAt(i));
                    }
                }

                oneByte= input.read();
            }
        }

    }
}
