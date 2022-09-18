package school.lesson2;
/* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

public class HomeWorkTask4Asterisk {
    public static void main(String[] args) {
        System.out.println(checkYear(1902));
    }

    public static boolean checkYear(int year) {

        //  boolean isLeap = true;
        if (year % 4 == 0 || ((year % 400 == 0) && !(year % 100 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
