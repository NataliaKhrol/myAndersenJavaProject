package school.lesson4;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog("Bobik");
        Animal animal3 = new Dog("Bobikus");
        Animal animal1 = new Dog("Muhtar");
        Animal animal4 = new Cat("Barsik");
        animal4.swim(15);
        animal.run(505);
        animal3.swim(5);
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
