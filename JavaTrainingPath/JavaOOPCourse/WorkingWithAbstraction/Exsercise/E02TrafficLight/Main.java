package JavaOOPCourse.WorkingWithAbstraction.Exsercise.E02TrafficLight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] input  = scanner.nextLine().split(" ");

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String light : input) {

            TrafficLight newTrafficLight = new TrafficLight(light);
            trafficLights.add(newTrafficLight);
        }

        int updateTimes =Integer.parseInt( scanner.nextLine());

        while (updateTimes-->0){

            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight.toString()+" ");
            }

            System.out.println();
        }

    }
}
