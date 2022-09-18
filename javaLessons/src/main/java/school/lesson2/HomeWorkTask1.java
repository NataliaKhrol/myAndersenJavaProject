package school.lesson2;

import java.util.Random;

/*
Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
 */
public class HomeWorkTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(checkSum(random.nextInt(11), random.nextInt(11)));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
