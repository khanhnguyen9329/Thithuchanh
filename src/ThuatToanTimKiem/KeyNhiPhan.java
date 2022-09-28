package ThuatToanTimKiem;

import java.util.Scanner;

public class KeyNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử trong mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ :" + (i));
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
        System.out.println();
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-------");
        System.out.println("vị trí phần tử 20 có index :");
//        System.out.println(nhiPhanDeQuy(arr, 0, arr.length, 20));
        System.out.println(keyNhiPhan(arr,20));
    }

        public static int keyNhiPhan(int[] arr, int key) {
        int dau = 0;
        int cuoi = arr.length - 1;

        while (cuoi >= dau) {
            int giua = (dau + cuoi) / 2;

            if (key > arr[giua]) {
                dau = giua + 1;
            } else if (key < arr[giua]) {
                cuoi = giua - 1;
            } else {
                return giua;
            }
        }
        return -1;
    }
//    public static int nhiPhanDeQuy(int[] arr, int dau, int cuoi, int value) {
//        dau = 0;
//        cuoi = arr.length - 1;
//        int giua = (dau + cuoi) / 2;
//
//        if (value == arr[giua]) {
//            return giua;
//        }
//        if (cuoi < dau) {
//            return -1;
//        }
//
//        if (value > arr[giua]) {
//            return nhiPhanDeQuy(arr, giua + 1, cuoi, value);
//
//        } else {
//            return nhiPhanDeQuy(arr, dau, giua - 1, value);
//        }
//
//    }
}
