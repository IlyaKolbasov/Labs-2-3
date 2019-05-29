package pets;

public abstract class Dog extends Pet {
    public Dog() {
        name = "Тузик";
        age = 5;
    }

    public abstract String execCommand(String command);

    public String eatFood(String food) {
        switch (food) {
            case "Мясо":
            case "Сосиска":
            case "Рыба":
                return "Ест!";

            default:
                return "Ест!";
        }
    }

    public String askFood() {
        return "Смотрит на тебя!";
    }
}
