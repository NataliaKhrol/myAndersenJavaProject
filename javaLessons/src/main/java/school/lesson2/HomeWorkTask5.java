package school.lesson2;
/* ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 � ������� ����� � ������� �������� 0 �� 1, 1 �� 0; */

public class HomeWorkTask5 {
    public static void main(String[] args) {
        replaceDigits();
    }

    public static void replaceDigits() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
