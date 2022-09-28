package MangVaPhuongThuc;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int array1[] = {6, 7, 8, 9, 10};
        int array2[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];

        }
        for (int i = 0; i < array1.length; i++) {
            array2[array.length + i] = array1[i];

        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
    }
}
