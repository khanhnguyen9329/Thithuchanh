package QuanLySinhVien29;

import java.io.File;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        PhuongThuc abc = new PhuongThuc();

        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            abc.show();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    abc.themHocVien();
                    break;
                case 2:
                    abc.hienThihocVien();
                    break;
                case 3:
                    abc.xoaDanhSach();
                    break;
                case 4:
                    System.out.println("Nhập tên file để lưu dữ liệu: ");
                    String file = scanner.nextLine();
                    File f = new File(file);
                    abc.ghiDuLieuXuongFile(f);
                    break;
                case 5:
                    System.out.println("nhập tên file muốn đọc :");
                    String file1 = scanner.nextLine();
                    File f1 = new File(file1);
                    abc.docDuLieuFile(f1);
                    break;
            }
        }
    }

}
