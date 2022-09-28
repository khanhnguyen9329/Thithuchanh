package QuanLyPhuongTienGiaoThong;

import java.util.Scanner;

public class PhuongTienGiaoThong {
    private int id;
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;
    private String mauSac;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauSac) {
        this.id = id;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauSac = mauSac;
    }
    public void inPutInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID của xe");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Hãng sản xuất :");
        hangSanXuat = sc.nextLine();
        System.out.println("Năm sản xuất :");
        namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá bán :");
        giaBan = Double.parseDouble(sc.nextLine());
        System.out.println("Màu sắc :");
        mauSac = sc.nextLine();
    }
    public void showInfo(){
        System.out.println("ID :"+ id);
        System.out.println("Hãng sản xuất :"+ hangSanXuat);
        System.out.println("Năm sản xuất :"+ namSanXuat);
        System.out.println("Giá bán :"+ giaBan);
        System.out.println("Màu sắc :"+ mauSac);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }


}
