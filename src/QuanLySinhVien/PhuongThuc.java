package QuanLySinhVien;

import java.util.Scanner;

public class PhuongThuc {

    Scanner sc = new Scanner(System.in);
    QuanLySinhVien1[] sinhVien1 = {};

    public void show() {
        for (int i = 0; i < sinhVien1.length; i++) {
            System.out.println(sinhVien1[i].toString());
        }

    }

    public void them() {

        QuanLySinhVien1 sv = creadSv();

        QuanLySinhVien1[] sinhVien2 = new QuanLySinhVien1[sinhVien1.length + 1];
        for (int i = 0; i < sinhVien1.length; i++) {
            sinhVien2[i] = sinhVien1[i];
        }
        sinhVien2[sinhVien2.length - 1] = sv;
        sinhVien1 = sinhVien2;
    }

    public void sua() {
        System.out.println("nhập vị trí muốn sửa");
        int index = Integer.parseInt(sc.nextLine());
        QuanLySinhVien1 sinhVien123 = creadSv();
        sinhVien1[index] = sinhVien123;
    }

    public void timkiem() {
        System.out.println("Nhập id sinh vien muốn tìm kiếm");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < sinhVien1.length; i++) {
            if (sinhVien1[i].getId() == id) {
                System.out.println(sinhVien1[i].toString());
                break;
            }

        }
    }

    public void xoa() {
        System.out.println("nhập vị trí muốn xóa");
        int viTri = Integer.parseInt(sc.nextLine());
        QuanLySinhVien1[] array = new QuanLySinhVien1[sinhVien1.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < viTri) {
                array[i] = sinhVien1[i];
            } else {
                array[i] = sinhVien1[i + 1];
            }

        }
        sinhVien1 = array;

    }


    public QuanLySinhVien1 creadSv() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập Tên");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        System.out.println("Nhâp gmail");
        String mail = sc.nextLine();
        QuanLySinhVien1 sv = new QuanLySinhVien1(id, name, age, address, mail);
        return sv;

    }



}
