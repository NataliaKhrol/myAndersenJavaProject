package school.lesson5.Task2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println(apple.getWeight());
        System.out.println(orange.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(orange);
        orangeBox2.addFruit(orange);

        System.out.println(orangeBox.getWeight());

     System.out.println(orangeBox.compare(appleBox));

     orangeBox.moveFruits(orangeBox2);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());
    }
}
