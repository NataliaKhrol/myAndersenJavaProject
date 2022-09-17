package school.lesson2;

/*
Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
 при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
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

