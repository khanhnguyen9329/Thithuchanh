package MangVaPhuongThuc;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
//        int[] array1 = {1, 3, 5, 7, 9};
//        System.out.println(min1(array1));
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử mảng");
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");

        }
        System.out.println();
        System.out.println(min1(array1) + " là số nhỏ nhất");


    }


    public static int min1(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}

