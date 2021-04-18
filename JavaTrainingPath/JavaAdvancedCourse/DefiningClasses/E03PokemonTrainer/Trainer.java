package JavaAdvancedCourse.DefiningClasses.E03PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int badges;
    private List<Pokemon> pokemonCollection;

    //"<TrainerName> <PokemonName> <PokemonElement> <PokemonHealth>
    public Trainer(String trainerName) {
        this.name = trainerName;
        this.badges = 0;
        this.pokemonCollection = new ArrayList<>();
    }


    public void addPokemon(Pokemon newPokemon){
        this.pokemonCollection.add(newPokemon);
    }


    public int getPokemonAmount(){
        return pokemonCollection.size();
    }

    public int getBadges(){
        return this.badges;
    }

    public void checkElement(String element){
        long count = this.pokemonCollection.stream().filter(pokemon -> pokemon.getElement().equals(element)).count();
        if (count == 0){
            hitCollection();
        }else{
            this.badges++;
        }
    }

    private void hitCollection(){
        for (Pokemon pokemon : pokemonCollection) {
            pokemon.setHealth(pokemon.getHealth() - 10);
            if (pokemon.getHealth()<=0){
                pokemonCollection.remove(pokemon);
            }

        }

    }
}
