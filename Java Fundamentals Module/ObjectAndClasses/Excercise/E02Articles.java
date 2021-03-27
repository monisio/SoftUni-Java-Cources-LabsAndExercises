package Fundamentals.ObjectAndClasses.Excercise;

import java.util.Scanner;

public class E02Articles {

    static class Article{
        String title ;
        String content;
        String author;



        public Article(String title, String content, String author){
            this.title= title;
            this.content=content;
            this.author=author;

        }

        public void editContent(String content){
            this.content=content;
        }

        public void changeAuthor(String author){
            this.author=author;
        }

        public void rename (String title){
            this.title=title;
        }

        @Override
        public String toString() {
            return title+" - " + content+": "+author;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(",\\s+");

        Article article = new Article(input[0],input[1],input[2]);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
           String [] tokens =  scanner.nextLine().split(":\\s");
            String info = tokens[1];
            switch (tokens[0]){
                case "Edit":
                    article.editContent(info);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(info);
                    break;
                case "Rename":
                    article.rename(info);

                    break;
            }


        }

        System.out.print(article.toString());


    }
}
