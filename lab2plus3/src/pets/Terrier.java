package pets;

import pets.Dog;

public class Terrier extends Dog {
    public Terrier(){
        name = "Альма";
        age = 2;
    }

    public String execCommand(String command){
        switch (command) {
            case "Сидеть!":
                return "Садится";
            case "Голос!":
                return "Гав!";
            default: return "Не понимает";
        }
    }
}
