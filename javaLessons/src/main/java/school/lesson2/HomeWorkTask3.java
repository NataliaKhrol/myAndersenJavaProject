package school.lesson2;

import java.util.Random;
/* �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� ����� �������������,
� ������� false ���� �������������. ���������: ���� ������� ������������� ������. */

public class HomeWorkTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(findNegativeNumeral(random.nextInt(-50, 50)));
        //������� ����������� �� -50 �� 50, � ������ �� ���� �� ���������...�� ��� ���������
    }

    /*
     ������ ������� ������� - ������ �������� �������:
        public static void main(String[] args) {
            System.out.println(findNegativeNumeral(0));
     */
    public static boolean findNegativeNumeral(int a) {
        boolean isNegative = true;
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
