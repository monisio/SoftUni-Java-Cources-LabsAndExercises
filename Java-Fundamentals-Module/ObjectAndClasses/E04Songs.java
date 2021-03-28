package Fundamentals.ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E04Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List <Song> listOfSongs = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String[] inputSong = scanner.nextLine().split("_");

            Song newSong = new Song(inputSong[0], inputSong[1], inputSong[2]);

            listOfSongs.add(newSong);


        }

        String searchCriteria = scanner.nextLine();

        for (int i = 0; i < listOfSongs.size(); i++) {

            if(searchCriteria.equals(listOfSongs.get(i).typeList)){
                System.out.println(listOfSongs.get(i).name);
            }else if(searchCriteria.equals("all")){
                System.out.println(listOfSongs.get(i).name);
            }


        }


    }
}
