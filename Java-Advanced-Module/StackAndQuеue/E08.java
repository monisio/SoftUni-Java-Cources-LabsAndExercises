package AdvancedJava.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardQueue = new ArrayDeque<>();




        while (!input.equals("Home")){

            String message = "";

            if(input.equals("back")){
               if(browserHistory.size()>1){
                   forwardQueue.addFirst(browserHistory.pop());
                   message = browserHistory.peek();
               }else{
                   message= "No previous pages";
               }
            }else if(input.equals("forward")){
                if (!forwardQueue.isEmpty()){
                   browserHistory.push(forwardQueue.poll());
                   message=browserHistory.peek();
                }else{
                    message="no next URLs";
                }
            }else{

                browserHistory.push(input);
                message= input;
                forwardQueue.clear();

            }

            if(!message.equals("")){

                System.out.println(message);
            }




            input= scanner.nextLine();
        }



    }
}
