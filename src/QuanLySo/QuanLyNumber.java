package QuanLySo;

import java.util.Scanner;

public class QuanLyNumber {
    static int[] arr1 = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {


            System.out.println(".1 Hiển Thị Mảng số");
            System.out.println(".2 thêm Phần tử");
            System.out.println(".3 Xóa Phần tử");
            System.out.println(".4 sửa số");


            int check = sc.nextInt();

            switch (check) {
                case 1:
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + "  ");
                    }
                    System.out.println();
                    break;
                case 2:

                    System.out.println("mời bạn nhập vị trí thêm mới");
                    int vitrithem = sc.nextInt();
                    System.out.println("nhập số muốn thêm ");
                    int soMuonThem = sc.nextInt();
                    int[] arr2 = new int[arr1.length+1];
                    for (int i = 0; i < arr1.length; i++) {
                        arr2[i] = arr1[i];
                    }
                    for (int i = arr1.length; i > vitrithem; i--) {
                        arr2[i] = arr2[i - 1];
                    }
                    arr2[vitrithem] = soMuonThem;
                    for (int i = 0; i < arr2.length; i++) {
                        System.out.println(arr2[i] + " ");
                    }
                    arr1 = arr2;
                    break;


                case 3:
                    System.out.println("Nhập vị trí muốn xóa");
                    int viTri1 = sc.nextInt();
                    int[] array = new int[arr1.length - 1];
                    for (int i = viTri1; i < arr1.length-1 ; i++) {
                        arr1[i] = arr1[i + 1];
//                        if (arr1[i] == arr1[i + 1]) {
                             array[i]  =arr1[i];
////
//                        }
                    }
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(arr1[i]+" ");

                    }
                    System.out.println();
                    arr1 = array;



                    break;
                case 4:
                    System.out.println("Nhap vi tri muốn sửa");
                    int viTri = sc.nextInt();
                    System.out.println("Nhập số cần thay");
                    int Number = sc.nextInt();
                    ;
                    for (int i = viTri; i < arr1.length; i++) {
                        arr1[viTri] = Number;
                        System.out.println(arr1[i]);
                    }

                    break;

            }
        }

    }


}

