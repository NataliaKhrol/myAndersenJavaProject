package school.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.addPurchase("Sofa", 350);
        p.addPurchase("Table", 589);
        p.print();
    }

}
