package JavaAdvancedCourse.DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Company company;
    private Car car;
    private List<Parents> parents;
    private List<Pokemon> pokemons;
    private List<Children> children;


    public Person(String name) {
        this.name = name;
        parents = new ArrayList<>();
        pokemons = new ArrayList<>();
        children = new ArrayList<>();
    }


    public void addParent(String name, String birthDate) {
        Parents parent = new Parents(name, birthDate);
        this.parents.add(parent);
    }

    public void addPokemon(String pokemonName, String pokemonType) {
        Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
        this.pokemons.add(pokemon);
    }

    public void setCompany(String companyName, String departmentName, Double salary) {
        this.company = new Company(companyName, departmentName, salary);
    }

    public void addChildren(String name, String birthDate) {
        Children children = new Children(name, birthDate);
        this.children.add(children);
    }

    public void setCar(String model, Integer carSpeed) {
        this.car = new Car(model, carSpeed);
    }


    public String getCompanyInfo() {
        if (this.company == null) {
            return "";
        }
        return this.company.toString();
    }

    public String getCarInfo() {
        if (this.car == null) {
            return "";
        }
        return this.car.toString();

    }

    public String getPokemonInfo() {
        if (this.pokemons.isEmpty()) {
            return "";
        }
        return getStringFromCollection(this.pokemons);

    }

    public String getParentsInfo() {
        if (parents.isEmpty()) {
            return "";
        }

        return getStringFromCollection(this.parents);
    }

    public String getChildrenInfo() {
        if (children.isEmpty()) {
            return "";
        }

        return getStringFromCollection(this.children);
    }

    private String getStringFromCollection(List<?> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toString());

            if (i < list.size() - 1) {
                sb.append(System.lineSeparator());
            }

        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s%nCompany: %s%nCar: %s%nPokemon: %s%nParents: %s%nChildren: %s"
                , this.name
                , getCompanyInfo(), getCarInfo(), getPokemonInfo(), getParentsInfo(), getChildrenInfo());
    }

    private static class Parents {
        String name;
        String birthDate;

        Parents(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        @Override
        public String toString() {
            return String.format("%s %s", this.name, this.birthDate);
        }
    }

    private static class Pokemon {
        String pokemonName;
        String pokemonType;

        Pokemon(String pokemonName, String pokemonType) {
            this.pokemonName = pokemonName;
            this.pokemonType = pokemonType;

        }

        @Override
        public String toString() {
            return String.format("%s %s", this.pokemonName, this.pokemonType);
        }
    }

    private static class Company {
        String companyName;
        String companyDepartment;
        Double salary;

        Company(String companyName, String companyDepartment, Double salary) {
            this.companyName = companyName;
            this.companyDepartment = companyDepartment;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("%n%s %s %.2f", this.companyName, this.companyDepartment, this.salary);
        }
    }

    private static class Children {
        String childName;
        String childBirthDate;

        Children(String childName, String childBirthDate) {
            this.childName = childName;
            this.childBirthDate = childBirthDate;
        }

        @Override
        public String toString() {
            return String.format("%s %s", this.childName, this.childBirthDate);
        }
    }

    private static class Car {
        String carModel;
        Integer carSpeed;

        Car(String carModel, Integer carSpeed) {
            this.carModel = carModel;
            this.carSpeed = carSpeed;
        }

        @Override
        public String toString() {
            return String.format("%n%s %d", this.carModel, this.carSpeed);
        }
    }
}
