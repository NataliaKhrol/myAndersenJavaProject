package school.lesson2;

import java.util.Random;
/* Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
указанную строку, указанное количество раз;  */

public class HomeWorkTask4 {
    public static void main(String[] args) {
    Random r = new Random();
    printLines("Hello, world", r.nextInt(1, 11));
}
     /*
     Второй вариант решения - задать значения вручную:
        public static void main(String[] args) {
             printLines("Hello, world", 5);
     */

    public static void printLines(String s, int a) {
        int count = 0;
        while (count < a) {
            System.out.println(s);
            count++;
        }
    }
}
