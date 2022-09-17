package school.lesson2;

/* ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������), � � ������� �����(-��)
��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������). ���������� �������� �����
�� ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, �� ���� [0][0], [1][1], [2][2], �, [n][n]; */

public class HomeWorkTask8 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;

                if (i == j || array.length - i - 1 == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

