package school.lesson4.task2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    void decreaseFood(int foodAmount) {
        if (food < foodAmount) {
            throw new RuntimeException("It is impossible to get more food than there is on the plate");
        } else {
            food -= foodAmount;
        }
    }

    public void increaseFood(int foodAmount) {
        food += foodAmount;
    }
}





