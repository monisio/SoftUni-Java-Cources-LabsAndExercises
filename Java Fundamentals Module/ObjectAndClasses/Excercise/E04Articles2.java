package Fundamentals.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E04Articles2 {
    static class Article {
        String title;
        String content;
        String author;


        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }

        public static Article parseNewArticle (String[] input){
           return new Article(input[0], input[1], input[2]);


        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;

        }



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());

        List<Article> listOfArticles = new ArrayList<>();

        for (int i = 0; i < n ; i++) {

            String [] input = scanner.nextLine().split(",\\s+");

            Article a = Article.parseNewArticle(input);

            listOfArticles.add(a);

        }


        String sortingCriteria = scanner.nextLine();

        printSortedByCriteria(listOfArticles, sortingCriteria);


        for (Article article : listOfArticles ){
            System.out.println(article.toString());

        }



    }

    private static void printSortedByCriteria(List<Article> listOfArticles, String sortingCriteria) {



        switch (sortingCriteria){
            case"title":
                listOfArticles.sort((a,b) -> a.getTitle().compareTo(b.getTitle()) );
                break;

            case "content":
                listOfArticles.sort((a,b) -> a.getContent().compareTo(b.getContent()) );
                break;

            case "author":
                listOfArticles.sort((a,b) -> a.getAuthor().compareTo(b.getAuthor()) );
                break;
        }

    }


}
