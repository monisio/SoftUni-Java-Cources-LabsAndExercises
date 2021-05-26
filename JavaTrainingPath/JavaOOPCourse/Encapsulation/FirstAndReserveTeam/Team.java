package JavaOOPCourse.Encapsulation.FirstAndReserveTeam;

import JavaOOPCourse.Encapsulation.SortByNameAndAge.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        firstTeam = new ArrayList<>();
        reserveTeam = new ArrayList<>();
    }

    private void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Person person){
        if (person.getAge()<40){
            this.firstTeam.add(person);
        }else {
            this.reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam(){
        //immutableCollection
         return  List.copyOf(firstTeam);
    }

    public List<Person> getReserveTeam(){
        //unmodifiableCollection
        return Collections.unmodifiableList(this.reserveTeam);
    }

}
