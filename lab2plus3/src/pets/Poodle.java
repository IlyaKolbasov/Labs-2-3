package pets;

import pets.Dog;

import java.util.Random;

public class Poodle extends Dog {
    public Poodle(){
        name = "Арчи";
        age = 9;
    }
    @Override
    public String eatFood(String food){
        switch (food){
            case "Мясо": case "Сосиска": case "Рыба": return "Ест!";
            default: return "Ест";
        }
    }

    @Override
    public String execCommand(String command){
        Random rand = new Random();
        boolean poodleThought = rand.nextBoolean();
        if (poodleThought == false)
            return "Устал.";
        else switch (command){
                case "Сидеть!": return " Садится";
                case "Голос!": return "Гав!";
                case "Принести палку!": return "Приносит палку";
                default: return "Не понимает";
            }
    }

}
