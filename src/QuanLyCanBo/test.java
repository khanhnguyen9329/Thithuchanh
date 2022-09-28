package QuanLyCanBo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhuongThucCanBo abcd = new PhuongThucCanBo();
        int choice;

        do {
            abcd.show1();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

                case 1:
                    System.out.println("1 Thêm công nhân");
                    System.out.println("2 Thêm Kĩ Sư");
                    System.out.println("3 Thêm nhân viên");
                    abcd.themCongNhan();
                    break;
                case 2:
                    abcd.themKiSu();
                    break;
                case 3:
                    abcd.themNhanVien();
                    break;
                case 4:
                    abcd.showCanBo();
                    break;
                case 5:
                    abcd.sapXep();
                    break;
            }
        } while (true);
    }
}