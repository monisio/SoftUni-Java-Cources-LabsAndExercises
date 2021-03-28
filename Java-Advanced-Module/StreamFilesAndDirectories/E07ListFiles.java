package AdvancedJava.StreamFilesAndDirectories;

import java.io.*;

public class E07ListFiles {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\35988\\Desktop\\Moni\\3. Advanced Module\\Java Advanced\\4.Streams, Files and Directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Writer writer = new PrintWriter("output.txt");

        File[] files = file.listFiles();

        for (File f : files) {

            if(!f.isDirectory()){
                 writer.write(f.getName()+": [" +f.length()+"]"+System.lineSeparator() );
            }
        }

            writer.close();
    }
}
