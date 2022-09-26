package school.lesson4;

public abstract class Animal {
    protected String name;
    final int runLimitRun;
    final int runLimitSwim;
    private static int count = 0;

    public Animal(String name, int runLimitRun, int runLimitSwim) {
        this.name = name;
        this.runLimitRun = runLimitRun;
        this.runLimitSwim = runLimitSwim;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance <= runLimitRun) {
            System.out.println(name + " run " + distance + " m. ");
        } else {
            System.out.println(name + " run " + runLimitRun + " m. " + " and got tired ");
        }
    }

    public void swim(int distance) {
        if (distance <= runLimitSwim) {
            System.out.println(name + " swam " + distance + " m. ");
        } else {
            System.out.println(name + " swam " + runLimitSwim + " m. " + " and got tired ");
        }
    }
}


