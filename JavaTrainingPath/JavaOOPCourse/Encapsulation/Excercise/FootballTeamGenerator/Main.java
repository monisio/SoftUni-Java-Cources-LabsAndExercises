package JavaOOPCourse.Encapsulation.Excercise.FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");

        Map<String, Team> teams = new LinkedHashMap<>();


        while (!input[0].equals("END")) {
            String command = input[0];
            try{

                switch (command) {

                    case "Team":

                        Team team = new Team(input[1]);
                        teams.putIfAbsent(team.getName(), team);
                        break;
                    case "Add":
                        Team teamToAddPlayer = teams.get(input[1]);

                        if (teamToAddPlayer != null) {
                            Player player = new Player(input[2], Integer.parseInt(input[3])
                                    , Integer.parseInt(input[4]), Integer.parseInt(input[5])
                                    , Integer.parseInt(input[6]), Integer.parseInt(input[7]));
                            teamToAddPlayer.addPlayer(player);
                        } else {
                            System.out.printf("Team %s does not exist.%n", input[1]);
                        }


                        break;

                    case "Remove":
                        teams.get(input[1]).removePlayer(input[2]);
                        break;
                    case "Rating":
                        Team team1 = teams.get(input[1]);
                        if (team1 != null) {
                            System.out.println(team1.getName() + " - " + Math.round(team1.getRating()));
                        } else {
                            System.out.printf("Team %s does not exist.%n", input[1]);
                        }
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


            input = scanner.nextLine().split(";");
        }


    }
}
