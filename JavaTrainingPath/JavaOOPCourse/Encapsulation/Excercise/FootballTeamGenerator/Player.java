package JavaOOPCourse.Encapsulation.Excercise.FootballTeamGenerator;

public class Player {
    //-	name: String
    //-	endurance:  int
    //-	sprint:  int
    //-	dribble: int
    //-	passing: int
    //-	shooting: int
    //+ 	Player (String, int, int, int, int, int)
    //-	setName(String) : void
    //+	getName(): String
    //-	setEndurance (int) : void
    //-	setSprint (int) : void
    //-	setDribble (int) : void
    //-	setPassing (int) : void
    //-	setShooting (int) : void
    //+	overallSkillLevel() : double

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name , int endurance, int sprint, int dribble , int passing , int shooting){
       this.setName(name);
       this.setEndurance(endurance);
       this.setSprint(sprint);
       this.setDribble(dribble);
       this.setPassing(passing);
       this.setShooting(shooting);
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setEndurance(int endurance) {
        if(!isInTolerance(endurance)){

            invalidStatError("Endurance");
        }

        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if(!isInTolerance(sprint)){
            invalidStatError("Sprint");

        }

        this.sprint = sprint;
    }

    private void setDribble(int dribble) {

        if(!isInTolerance(dribble)){
            invalidStatError("Dribble");
        }

        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if(!isInTolerance(passing)){
            invalidStatError("Passing");
        }

        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if(!isInTolerance(shooting)){
            invalidStatError("Shooting");
        }
        this.shooting = shooting;
    }

    public double overallSkillLevel(){
       return (this.dribble+this.endurance+this.passing+this.shooting+this.sprint)/5.0;
    }

    private void invalidStatError(String statName){
        throw new IllegalArgumentException(statName+" should be between 0 and 100.");
    }

    private boolean isInTolerance(int stat){
        return (stat>=0&&stat<=100);
    }

}
