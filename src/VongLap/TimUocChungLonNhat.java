package VongLap;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        int a = sc.nextInt();
        System.out.println("nhập số b");
        int b = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    System.out.println("Ước chung lớn nhất \t" + i);
                    break;
                }

            }
        }
    }
}
