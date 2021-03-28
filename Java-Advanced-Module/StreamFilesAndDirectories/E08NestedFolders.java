package AdvancedJava.StreamFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class E08NestedFolders {
    public static void main(String[] args) {



        Deque<File> folders = new ArrayDeque<>();
        File root = new File("C:\\Users\\35988\\Desktop\\Moni\\3. Advanced Module\\Java Advanced\\4.Streams, Files and Directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources");

            folders.offer(root);

            int counter = 0;

        while(!folders.isEmpty()){
            if(folders.peek().isDirectory()){
                File[] files = folders.poll().listFiles();

                for (File file : files) {
                     if(file.isDirectory()){
                         counter++;
                         folders.offer(file);
                         System.out.println(file.getName());
                     }
                }

            }

        }

        System.out.println(counter+" folders");
    }
}
