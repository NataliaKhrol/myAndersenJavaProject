package school.lesson2;

import java.util.Random;
/*
Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит в пределах от 10 до 20 (включительно),
если да Ц вернуть true, в противном случае Ц false.
 */
public class HomeWorkTask1 {
    public static void main(String[] args) {
        System.out.println(checkSum());
    }

    public static boolean checkSum() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int sum = a + b;
        boolean isEqual = true;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
