package school.lesson6;

//Создать нову ветку!!!!!!!!!!!!!!
//Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и
// вывести результат расчета.


public class ArrayString {
    public static void main(String[] args) {
        String[][] myMatrix = new String[4][4];
        try {
            int sum = myArray(myMatrix); //синтаксис для принятия значения из return
            System.out.println(sum);

        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int myArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("The size of the matrix must be 4х4");
        }
        //проходим по всем влож.масс.
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("The size of the matrix must be 4х4");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("The cell: " + arr[i][j] + " doesn't contain a number");
                }
            }
        }
        return sum;
    }
}


