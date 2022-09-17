package school.lesson2;
/*
Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
public class HomeWorkTask6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] array = new int[100];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = j + 1;
            j++;
            System.out.print(array[i] + " ");
        }
    }
}
