package Fundamentals.Lists.Excersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Integer> pokemonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int pokemonIndexToRemove = Integer.parseInt(scanner.nextLine());

        int sumOfRemoved=0;



        while (!pokemonsList.isEmpty()){
            int value;

            if (pokemonIndexToRemove<0){

                value = pokemonsList.get(0);
                pokemonsList.set(0, pokemonsList.get(pokemonsList.size()-1));
                sumOfRemoved += value;

            }else if (pokemonIndexToRemove>pokemonsList.size()-1){

                value= pokemonsList.get(pokemonsList.size()-1);
                pokemonsList.set(pokemonsList.size()-1, pokemonsList.get(0));
                sumOfRemoved += value;
            }else{

                value = pokemonsList.get(pokemonIndexToRemove);
                pokemonsList.remove(pokemonIndexToRemove);
                sumOfRemoved+= value;
            }



            for (int i = 0; i < pokemonsList.size(); i++) {

                if(pokemonsList.get(i)<=value){
                    pokemonsList.set(i, pokemonsList.get(i)+value);
                }else {
                    pokemonsList.set(i, pokemonsList.get(i)-value);
                }



            }



            if(pokemonsList.isEmpty()){
                break;
            }

            pokemonIndexToRemove=scanner.nextInt();
        }


        System.out.println(sumOfRemoved);
    }




}
