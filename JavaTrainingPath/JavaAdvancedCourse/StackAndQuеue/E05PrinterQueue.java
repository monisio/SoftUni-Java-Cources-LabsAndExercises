package JavaAdvancedCourse.StackAndQuеue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();



        while(!input.equals("print")){

            if(!input.equals("cancel")){
                printerQueue.offer(input);

            }else{

                 if(!printerQueue.isEmpty()){
                     System.out.println("Canceled "+ printerQueue.poll());
                 }else{
                     System.out.println("Printer is on standby");
                 }

            }


         input= scanner.nextLine();
        }

        while (!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }


    }
}
