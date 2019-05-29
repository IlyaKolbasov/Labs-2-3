package core;

import pets.Cat;
import pets.Dog;

public class Logic {
    public Logic() {
    }

    public String giveCommand(Master master, int dogNum, String command) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Кот не выполняет ваши команды!";
        return master.giveACommand((Dog) master.getPets().get(dogNum), command);
    }

    public String feed(Master master, int dogNum) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Кот не есть собачью Еду!";
        return master.giveFood((Dog) master.getPets().get(dogNum));
    }

    public String walk(Master master, int dogNum) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Кот не любит гулять!";
        return master.walkADog((Dog) master.getPets().get(dogNum));
    }

    public String sleep(int catNum, Master master) {
        if (master.getPets().get(catNum) instanceof Dog)
            return "Собака не хочет спать!";
        return ((Cat)master.getPets().get(catNum)).sleep();
    }

    public String askFood(int dogNum, Master master) {
        if (master.getPets().get(dogNum) instanceof Cat)
            return "Попросит, когда захочет!";
        return ((Dog)master.getPets().get(dogNum)).askFood();
    }
}
