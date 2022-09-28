package QuanLySinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        PhuongThuc abc = new PhuongThuc();
        Scanner sc = new Scanner(System.in);
        int number;

      do {
            show01();
            number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    abc.show();
                    break;
                case 2:
                    abc.them();
                    break;
                case 3:
                    abc.sua();
                    break;
                case 4:
                    abc.xoa();
                    break;
                case 5:
                    abc.timkiem();
                    break;
                case 6:
                    System.out.println("bye bye");
                    break;
                default:
                    System.err.println("Nhập sai thông tin");

            }

        }
        while (number !=6);






    }

    public static void show01() {
        System.out.println("Menu");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm");
        System.out.println("3.Sửa");
        System.out.println("4.Xóa");
        System.out.println("5.Tìm Kiếm");
        System.out.println("6.thoát");
    }
}
