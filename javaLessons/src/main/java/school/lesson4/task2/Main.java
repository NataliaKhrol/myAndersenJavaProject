package school.lesson4.task2;

public class Main {
    public static void main(String[] args) {
        // создаем котов
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 5);
        cat[1] = new Cat("Markiz", 7);
        cat[2] = new Cat("Tihon", 10);
        Plate plate = new Plate(20);

        // кормим котов
        for (Cat c : cat) {
            c.eat(plate);
        }

        // смотрим результат
        for (Cat c : cat) {
            if (c.isHungry()) {
                System.out.println("Cat " + c.getName() + " is hungry.");
            } else {
                System.out.println("Cat " + c.getName() + " is not hungry.");
            }
        }
        // проверка сколько еды остается на тарелке
        System.out.println("Plate contains " + plate.getFood());
    }
}