package school.lesson2;

import java.util.Random;
/*
�������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20 (������������),
���� �� � ������� true, � ��������� ������ � false.
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
