package school.lesson2;

/* �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ���������� ������
���� int ������ len, ������ ������ �������� ����� initialValue; */

public class HomeWorkTask9 {
    public static void main(String[] args) {
        createArray(3,5);

    }
    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i <array.length; i++){
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }
}
