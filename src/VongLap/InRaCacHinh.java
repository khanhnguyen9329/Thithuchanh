package VongLap;

import java.util.Scanner;

public class InRaCacHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều dài");
        int height = sc.nextInt();
        int number = 1;
        while (number <= height) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
            number++;
        }

    }
}
