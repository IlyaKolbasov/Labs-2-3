package pets;

import pets.Dog;

public class Shepherd extends Dog {
    public Shepherd(){
        name = "Вилли";
        age = 5;
    }
    @Override
    public String execCommand(String command){
        switch (command){
            case "Сидеть!":
                return "Садится";
            case "Голос!":
                return "Гав!";
            case "Принести палку!": return "Приносит палку";
            default:
                return "Не понимает";
        }
    }
}
