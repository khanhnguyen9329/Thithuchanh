package VongLap;

import java.util.Scanner;

public class TinhLainganhang {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng");
        month = sc.nextInt();
        System.out.println("nhập tỉ lệ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate/100/12)* 3;
            
        }
        System.out.println("total_interset :"+ total_interset);
    }
}
