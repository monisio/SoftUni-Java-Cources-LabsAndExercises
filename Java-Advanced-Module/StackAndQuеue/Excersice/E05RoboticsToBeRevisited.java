package AdvancedJava.StackAndQuеue.Excersice;

import java.util.*;

public class E05RoboticsToBeRevisited{

    public static class Robot {
        // class should be romeved because on last test it seems that there is a long chain of robots created and the therefore the code has slow performance
        String robotName;
        int processTime;
        int currentTime;

        public Robot(String robotName, int processTime) {
            this.robotName = robotName;
            this.processTime = processTime;

        }

        public String getRobotName() {
            return robotName;
        }

        public int getProcessTime() {
            return processTime;
        }

        public int getCurrentTime() {
            return currentTime;
        }

        public void setCurrentTime(int currentTime) {
            this.currentTime = currentTime;
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobotsNames = scanner.nextLine().split(";");

        int[] timer = Arrays.stream(scanner.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();

        int timeInSeconds = timer[0] * 3600 + timer[1] * 60 + timer[2];

        List<Robot> robots = new ArrayList<>();
        ArrayDeque<String> materialsQueue = new ArrayDeque<>();


        for (int i = 0; i < inputRobotsNames.length; i++) {

            String[] newRobotName = inputRobotsNames[i].split("-");

            Robot addRobot = new Robot(newRobotName[0], Integer.parseInt(newRobotName[1]));

            robots.add(addRobot);
        }



        String incomingMaterial = scanner.nextLine();

        while (!incomingMaterial.equals("End")) {


            materialsQueue.offer(incomingMaterial);

            incomingMaterial = scanner.nextLine();
        }

        while (!materialsQueue.isEmpty()) {
            timeInSeconds++;

            String currentMaterial = materialsQueue.poll();
            boolean isThereFreeRobots = false;

            for (int i = 0; i < robots.size(); i++) {
                Robot current = robots.get(i);
                current.setCurrentTime(current.getCurrentTime() - 1);

            }

            for (int i = 0; i < robots.size(); i++) {


                Robot currentRobot = robots.get(i);

                if (currentRobot.getCurrentTime() <= 0) {
                    currentRobot.setCurrentTime(currentRobot.getProcessTime());
                    System.out.println(currentRobot.getRobotName() + " - " + currentMaterial + " " + getCurrentTime(timeInSeconds));
                    isThereFreeRobots = true;
                    break;
                }


            }


            if (!isThereFreeRobots) {
                materialsQueue.offer(currentMaterial);
            }


        }


    }

    private static String getCurrentTime(int timeInSeconds) {
        int hours = (timeInSeconds/3600) % 24;
        int minutes = (timeInSeconds % 3600) / 60 ;
        int seconds = timeInSeconds % 60;



        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);

    }


}