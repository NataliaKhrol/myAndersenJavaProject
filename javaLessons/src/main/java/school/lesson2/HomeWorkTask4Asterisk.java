package school.lesson2;
/* Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

public class HomeWorkTask4Asterisk {
    public static void main(String[] args) {
        System.out.println(isLeap(1904));
    }

    // public static boolean checkYear(int year) {
    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            // если делится на 400 то высокосный
            return true;
        } else if (year % 100 == 0) {
            // если не делится на 400, но делится на 100, то не высокосный
            return false;
        } else if (year % 4 == 0) {
            // если не делится на 400 и не делится на 100, но делится на 4, то высокосный
            return true;
        } else {
            // если не делится на 400, не делится на 100 и не делится на 4, то не высокосный
            return false;
        }
    }
}
