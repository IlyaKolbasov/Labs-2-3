package core;

import pets.*;
import dogfood.DogFood;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Master {

    private DogFood someFood = new DogFood();
    private List<Pet> pets = new ArrayList<>();

    public Master() {
        Random r = new Random();
        int n = r.nextInt(11);
        someFood.fill(n);
    }

    public void addCat() {
        pets.add(new Cat());
    }

    public void addDog(DogTypes type) {
        switch (type) {
            case TERRIER: {
                pets.add(new Terrier());
                break;
            }
            case POODLE: {
                pets.add(new Poodle());
                break;
            }
            case SHEPHERD: {
                pets.add(new Shepherd());
                break;
            }
        }
    }

    String giveACommand(Dog dog, String command) {
        return dog.execCommand(command);
    }

    String giveFood(Dog dog) {
        if (someFood.foodsLeft() == 0)
            return "error: В вашей сумке нет еды";
        return dog.eatFood(someFood.getFood());
    }

    String walkADog(Dog dog) {
        return "Идем на прогулку";
    }

    List<Pet> getPets() {
        return pets;
    }
    public ArrayList<String> getPetList() {
        ArrayList<String> petList = new ArrayList<String>();
        for (int i = 0; i < pets.size(); i++) {
            petList.add(pets.get(i).getName());
        }
        return petList;
    }
}
