package ThuVienSach;

import java.util.Scanner;

public class SinhVien {
    private String name;
    private int maSinhVien;
    private String ngaySinh;
    private int lop;

    public SinhVien() {
    }

    public SinhVien(String name, int maSinhVien, String ngaySinh, int lop) {
        this.name = name;
        this.maSinhVien = maSinhVien;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }
    public void inPutInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên Sinh viên :");
        name = scanner.nextLine();
        System.out.println("Mã sinh viên :");
       maSinhVien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sinh :");
        ngaySinh = scanner.nextLine();
        System.out.println("Nhâp lớp :");
        lop = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", maSinhVien=" + maSinhVien +
                ", ngaySinh=" + ngaySinh +
                ", lop=" + lop +
                '}';
    }

    private class localD {
    }
}
