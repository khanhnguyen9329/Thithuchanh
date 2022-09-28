package MangVaPhuongThuc;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {2, 4, 6, 7, 8, 9, 8};
        System.out.print("vi tri can xoa");
        int vitrixoa = sc.nextInt();
        for (int i = vitrixoa; i < array.length - 1; i++) {
            array[i] = array[i + 1];

        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]+",");
        }
    }


}


