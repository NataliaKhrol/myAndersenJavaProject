package school.lesson4;

public class Cat extends Animal {
    private static int count = 0;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can not swim");
    }

}
