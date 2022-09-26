package school.lesson4.task4;

import school.lesson4.task3.Payment;

public class Main {
    public static void main(String[] args) {
        Park p = new Park("Pirate's");
        p.addAttraction("Hali-Gali", 35, "9am-9pm");
        p.addAttraction("Merry-goes-Round", 57, "10am-8pm");
        p.addAttraction("HappyRabbit", 87, "10m-11pm");
        p.print();
    }

}
