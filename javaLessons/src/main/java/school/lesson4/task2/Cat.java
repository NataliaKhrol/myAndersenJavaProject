package school.lesson4.task2;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean hungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate p) {
        // если еды в тарелке хватает, кот ест
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            hungry = false;
        }
        // если еды не хвтает, кот уходит
    }
}


