package JavaAdvancedCourse.DefiningClasses.E03PokemonTrainer;

public class Pokemon {

    private String pokemonName;
    private String pokemonElement;
    private int pokemonHealth;

    public Pokemon(String pokemonName, String pokemonElement,int pokemonHealth){
        this.pokemonName=pokemonName;
        this.pokemonElement=pokemonElement;
        this.pokemonHealth = pokemonHealth;
    }

    public String getElement(){
      return this.pokemonElement;
    }

    public int getHealth(){
        return this.pokemonHealth;
    }

    public void setHealth(int health){
        this.pokemonHealth = health;
    }
}
