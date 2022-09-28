package school.lesson5.Task2;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T obj;

    public Box() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    ArrayList<T> arrayList = new ArrayList<>();

    int getWeight() {
        int weight = 0;
        for (T fruit : arrayList) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    void addFruit(T fruit) {
        arrayList.add(fruit);
    }

    boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }
        // return this.getWeight() == box.getWeight();
    }

    void moveFruits(Box<T> box) {
        this.arrayList.addAll(box.arrayList);
        box.arrayList.clear();
    }
}

