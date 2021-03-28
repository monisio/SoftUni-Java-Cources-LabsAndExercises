package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        while (!input.equals("Home")){

            if(input.equals("back")){

                if (browserHistory.size()>=2){
                    browserHistory.pop();

                }else{
                    System.out.println("no previous URLs");
                    input =scanner.nextLine();
                    continue;
                }
            }else{

                browserHistory.push(input);
            }


            System.out.println(browserHistory.peek());

            input = scanner.nextLine();
        }

    }
}
