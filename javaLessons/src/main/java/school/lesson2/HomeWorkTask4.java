package school.lesson2;

import java.util.Random;
/* �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� � �������
��������� ������, ��������� ���������� ���;  */

public class HomeWorkTask4 {
    public static void main(String[] args) {
    Random r = new Random();
    printLines("Hello, world", r.nextInt(1, 11));
}
     /*
     ������ ������� ������� - ������ �������� �������:
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
