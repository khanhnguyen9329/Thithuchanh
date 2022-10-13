package QuanLySinhVien29;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class HocVien implements Serializable {
    private String name;
    private int tuoi;
    private String gioiTinh;
    private int soDienThoai;
    private String ngaySinh;
    private Lop thongTinLop = new Lop() ;

    public HocVien() {
    }

    public HocVien(String name, int tuoi, String gioiTinh, int soDienThoai, String ngaySinh, Lop thongTinLop) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.thongTinLop = thongTinLop;
    }
    public void inPutInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học viên:");
        name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên:");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính :");
        gioiTinh = scanner.nextLine();
        System.out.println(" Nhập số điện thoại: ");
        soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sinh :");
        ngaySinh = scanner.nextLine();
        thongTinLop.inPutInfo1();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Lop getThongTinLop() {
        return thongTinLop;
    }

    public void setThongTinLop(Lop thongTinLop) {
        this.thongTinLop = thongTinLop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai=" + soDienThoai +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", thongTinLop=" + thongTinLop +
                '}';
    }
}
