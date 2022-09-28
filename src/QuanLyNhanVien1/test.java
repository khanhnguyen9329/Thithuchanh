package QuanLyNhanVien1;

import java.util.Scanner;

public class test {

    static QuanLyNhanVien[] nhanVien = new QuanLyNhanVien[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nhanVien[0] = new NvFullTime(1, "nam", 19, "Hà Nội", 500000);
        nhanVien[1] = new NvFullTime(2, "toan", 27, "Hà Tây", 400000);
        nhanVien[2] = new NvFullTime(3, "khanh", 15, "Hà Nam", 300000);


        nhanVien[3] = new NvPartime(4, "Linh1", 30, "Hà Nội", 20);
        nhanVien[4] = new NvPartime(5, "Linh2", 31, "Hà Nội", 25);
        nhanVien[5] = new NvPartime(6, "Linh3", 33, "Hà Nội", 29);


        System.out.println("1. Hiển thị nhân viên");
        System.out.println("2. Thêm nhân viên");
        System.out.println("3. Xóa nhân viên");

        int check = sc.nextInt();

        switch (check) {
            case 1:
                show(nhanVien);
            case 2:
                themSinhVien(nhanVien);
            case 3:
        }

    }

    public static void show(QuanLyNhanVien[] Nv) {
        for (int i = 0; i < Nv.length; i++) {
            System.out.println(Nv[i].toString());
        }
    }

    public static void themSinhVien(QuanLyNhanVien[] nhanvien12345) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập Id");
        int id = sc.nextInt();
        System.out.println("Nhập Tên");
        String name = sc.nextLine();
        System.out.println("Nhâp tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        System.out.println("lương");
        double hienThiLuong = Integer.parseInt(sc.nextLine());
        QuanLyNhanVien[] nhanvien12 = new QuanLyNhanVien[100];
        int sl = 6;
        nhanvien12[6] = new NvFullTime(id, name, age, address, hienThiLuong);
        System.out.println(nhanvien12[0]);
        for (int i = 0; i < nhanVien.length; i++) {
            nhanvien12[i] = nhanVien[i];
        }
       

    }
}

