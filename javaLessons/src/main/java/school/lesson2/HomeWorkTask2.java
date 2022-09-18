package school.lesson2;

import java.util.Random;
/*
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное
ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
public class HomeWorkTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        checkNumerals(random.nextInt(-50, 50));
        //сделала ограничение на значение числа от -50 до 50, в задаче об этом не говорится...но так нагляднее
    }
    /*
     Второй вариант решения:
        public static void main(String[] args) {
            checkNumerals(0);
     */
    public static void checkNumerals(int a) {
        if (a >= 0) {
            System.out.println("Число a равно " + a + " и является положительным");
        } else {
            System.out.println("Число a равно " + a + " и является отрицательным");

        }
    }
}
