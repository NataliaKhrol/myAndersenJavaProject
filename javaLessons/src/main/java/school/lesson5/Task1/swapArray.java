package school.lesson5.Task1;

public class swapArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        swapArray(array, 0, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void swapArray(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}


