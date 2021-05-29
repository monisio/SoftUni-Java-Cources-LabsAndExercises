package JavaOOPCourse.Encapsulation.Excercise.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    //name: String
    //players: List<Player>
    //Team (String)
    //setName(String) : void
    //getName(): String
    //addPlayer(Player) : void
    //removePlayer(String) : void
    //getRating() : double

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(String name){
        players.stream().map(p -> p.getName().equals(name)).count();
    }

    public double getRating(){

    }
}
