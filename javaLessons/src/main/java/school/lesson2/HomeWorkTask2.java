package school.lesson2;

import java.util.Random;
/*
�������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������, �������������
�� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.
 */
public class HomeWorkTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        checkNumerals(random.nextInt(-50, 50));
        //������� ����������� �� �������� ����� �� -50 �� 50, � ������ �� ���� �� ���������...�� ��� ���������
    }
    /*
     ������ ������� �������:
        public static void main(String[] args) {
            checkNumerals(0);
     */
    public static void checkNumerals(int a) {
        if (a >= 0) {
            System.out.println("����� a ����� " + a + " � �������� �������������");
        } else {
            System.out.println("����� a ����� " + a + " � �������� �������������");

        }
    }
}
