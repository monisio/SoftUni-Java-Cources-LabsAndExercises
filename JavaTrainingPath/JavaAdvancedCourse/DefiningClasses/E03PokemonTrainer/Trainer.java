package JavaAdvancedCourse.DefiningClasses.E03PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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



    public int getBadges(){
        return this.badges;
    }

    public int getPokemonAmount(){
        return pokemonCollection.size();
    }

    public void addPokemon(Pokemon newPokemon){
        this.pokemonCollection.add(newPokemon);
    }

    public void checkElement(String element){
       if(!this.pokemonCollection.isEmpty()){
           long count = this.pokemonCollection.stream().filter(pokemon -> pokemon.getElement().equals(element)).count();

           if (count != 0){
                   this.badges+=1;
           }else{
               pokemonCollection.forEach(e->e.setHealth(e.getHealth()-10));
              this.pokemonCollection = pokemonCollection.stream().filter(e->e.getHealth()>0).collect(Collectors.toList());
           }

       }
    }



}
