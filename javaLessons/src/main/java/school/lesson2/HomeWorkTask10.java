package school.lesson2;

/*
�������� �����, �������� �� ���� �������� ���������� ������ � ����� n (����� ���� �������������, ��� �������������),
��� ���� ����� ������ �������� ��� �������� ������� �� n �������. �������� ��������� ��������. ��� ���������� ������
������ ������������ ���������������� ���������. �������: [ 1, 2, 3 ] ��� n = 1 (�� ���� ������) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
 ��� n = -2 (�� ��� �����) -> [ 6, 1, 3, 5 ]. ��� ����� n � ����� ������� ����� ������ �������� ����.
 */
public class HomeWorkTask10 {
    public static void main(String[] args) {
        shiftArray(new int[]{1, 2, 3}, -2);
    }

    public static void shiftArray(int[] array, int n) {
        int count = 0;
        if (n > 0) {
            do {
                for (int i = array.length - 2; i >= 0; i--) {
                    int rightInd = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = rightInd;
                    count += 1;
                }
            }
            while (count <= n);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        } else {
            do {
                for (int i = 0; i < array.length-1; i++) {
                    int leftInd = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = leftInd;
                    count += 1;
                }
            }
            while (count <= n);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
    }
}

