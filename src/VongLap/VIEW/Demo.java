package VongLap.VIEW;

import javax.swing.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        JFrame jf = new JFrame();
//// gắn tên
//        jf.setTitle("DeMo giao diện");
//        // kích thước
//        jf.setSize(600,400);
//        // tạo bảng giao diện
//        jf.setVisible(true);
//        // chỉnh bảng giao diện ra giữa
//jf.setLocation(300,300);
//
//// thoat ra khỏi chương trình
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = Integer.parseInt(scanner.nextLine());
            int count = 0;
            boolean check = dangNhap(a);
            if (check) {
                break;
            } else if(count ==3){

                System.out.println("cót");
            } else {


            } count ++;
        }


    }

    public static boolean dangNhap(int a) {
        while (true) {
            if (a == 3) {
                System.out.println("ok");
                return true;
            } else {
                System.out.println("sai rồi bạn à");

            }
            return false;

        }
    }
}
