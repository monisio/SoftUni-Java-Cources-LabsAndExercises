package JavaOOPCourse.Encapsulation.Excercise.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        boolean isPlayerFound = false;

        for (int i = 0; i < this.players.size(); i++) {
            String currentName = players.get(i).getName();
            if (currentName.equals(playerName)) {
                this.players.remove(i);
                isPlayerFound = true;
                break;
            }
        }

        if (!isPlayerFound) {
            System.out.printf("Player %s is not in %s team.%n", playerName, this.name);
        }
    }

    public double getRating() {
        return players.stream().map(Player::overallSkillLevel).mapToDouble(Double::valueOf).average().orElse(0);

    }
}
