package QuanLyNhanVien1;

import java.util.Scanner;

public class abc123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Nhập Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        System.out.println("Nhâp tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("lương");
        double hienThiLuong = Integer.parseInt(sc.nextLine());
        QuanLyNhanVien[] nhanvien12 = new QuanLyNhanVien[100];
        int sl=0;
        nhanvien12[0]= new NvFullTime(id,name,age,address,hienThiLuong);
        System.out.println(nhanvien12[0]);

    }
        }
