package school.lesson5;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        String[] myArr = new String[10];
        myArr[0] = "hello";
        myArr[1] = "goodbye";
        System.out.println(myArr[0]);

        ArrayList <String> ark = new ArrayList<>();
        System.out.println(ark.size());
        ark.ensureCapacity(10);
        ark.add(0, "hello");
        ark.add(1, "bye");
        System.out.println(ark.get(0));
    }
}
