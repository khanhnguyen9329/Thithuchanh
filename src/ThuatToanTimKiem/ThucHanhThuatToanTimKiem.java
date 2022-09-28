package ThuatToanTimKiem;

import java.util.Scanner;

public class ThucHanhThuatToanTimKiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 5, 7, 9, 11, 54, 56, 190};
        System.out.println("Nhập số cần tìm");
        int n = scanner.nextInt();
        System.out.println(thuatToanTimKiem(arr, n));
    }

    public static int thuatToanTimKiem(int[] arr, int key) {
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
}
