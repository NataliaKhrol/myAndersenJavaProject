package school.lesson2;

import java.util.Random;
/* Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
и вернуть false если положительное. Замечание: ноль считаем положительным числом. */

public class HomeWorkTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(findNegativeNumeral(random.nextInt(-50, 50)));
        //сделала ограничение от -50 до 50, в задаче об этом не говорится...но так нагляднее
    }

    /*
     Второй вариант решения - задать значения вручную:
        public static void main(String[] args) {
            System.out.println(findNegativeNumeral(0));
     */
    public static boolean findNegativeNumeral(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
