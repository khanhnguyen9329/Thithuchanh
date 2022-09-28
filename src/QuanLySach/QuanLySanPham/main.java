package QuanLySach.QuanLySanPham;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PhuongThuc abc = new PhuongThuc();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String n;
        do {
            show();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị sản Phẩm");
                    abc.showSanPham();
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm");
                    abc.themSanPham();
                    break;
                case 3:
                    System.out.println(" Nhập mã sản phẩm muốn xóa ");
                    n = scanner.nextLine();
                    abc.xoaSanPham(n);
                    break;
                case 4:
                    System.out.println("Nhập mã sản phẩm cần tìm");
                    n = scanner.nextLine();
                    abc.suaSanPham(n);
                    break;

                case 5:

                    break;
                default:
                    System.out.println("Nhập sai dữ liệu");
            }


        } while (choice != 6);


    }
    public static void show(){
        System.out.println("1.Hiển thị sản phẩm");
        System.out.println("2.Thêm sản phẩm");
        System.out.println("3.Xóa");
        System.out.println("4.Sửa");
        System.out.println("5 Sắp xếp");
    }
}
