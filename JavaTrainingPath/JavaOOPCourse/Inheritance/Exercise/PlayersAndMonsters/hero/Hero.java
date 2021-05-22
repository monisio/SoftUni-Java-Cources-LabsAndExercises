package JavaOOPCourse.Inheritance.Exercise.PlayersAndMonsters.hero;

public class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;

    }

    public String getUsername() {
        return this.username;
    }

    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getSimpleName(),
                this.getUsername(),
                this.getLevel());
    }
}
