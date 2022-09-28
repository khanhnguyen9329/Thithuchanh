package VongLap;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        if( number <2){
            System.out.println("Không phải số nguyên tố");

        }else {
            boolean check = true;
            for (int j = 2; j < number ; j++) {
                if (number % j == 0) {
                    check = false;
                    break;
                }

            }
            if(check){
                System.out.println("Là số nguyên tố");
            }else {
                System.out.println("không phải số nguyên tố");
            }
        }
    }
}
