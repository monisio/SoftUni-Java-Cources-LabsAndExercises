package AdvancedJava.StreamFilesAndDirectories;

import java.io.*;

public class E05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\input";
        String outputPath = "C:\\Users\\35988\\IdeaProjects\\FirstStepsInCoding\\src\\AdvancedJava\\StreamFilesAndDirectories\\output.txt";


         try(BufferedReader reader = new BufferedReader(new FileReader(path));
          PrintWriter writer = new PrintWriter(new FileWriter(outputPath)))
         {
             int count = 1;
             String i;

             while ((i = reader.readLine())!= null){

                if (count%3==0){
                    writer.println(i);

                }

                count++;
            }

         }
    }
}
