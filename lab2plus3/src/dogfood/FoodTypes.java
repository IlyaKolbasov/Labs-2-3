package dogfood;

public enum FoodTypes {
    MEAT("Мясо"),
    SAUSAGE("Сосиска"),
    BONE("Кость"),
    FISH("Рыба");

    String foodName;

    FoodTypes(String name) {
        this.foodName = name;
    }
}
