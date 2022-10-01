package school.lesson6;


//Создать нову ветку!!!!!!!!!!!!!!

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


