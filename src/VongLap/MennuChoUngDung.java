package VongLap;

import java.util.Scanner;

public class MennuChoUngDung {
    public static void main(String[] args) {
        System.out.println("bấm 1 để vẽ hinh tam giác");
        System.out.println("bấm 2 để vẽ hinh  vuông");
        System.out.println("bấm 3 để vẽ hình chũ nhật");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
        case 1 :
            System.out.println("* * * * *");
            System.out.println("* * * * ");
            System.out.println("* * * ");
            System.out.println("* * ");
            System.out.println("* ");
            break;
        case 2 :
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            break;
    }
    }
}
