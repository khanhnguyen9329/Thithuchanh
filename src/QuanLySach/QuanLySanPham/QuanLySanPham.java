package QuanLySach.QuanLySanPham;

import java.util.Scanner;

public class QuanLySanPham{
    String maSanPham;
    String tenSanPham;
    double giaSanPham;
    int soLuong;
    String moTa;

    public QuanLySanPham() {
    }

    public QuanLySanPham(String maSanPham, String tenSanPham, double giaSanPham, int soLuong, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }


    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản Phẩm :");
        maSanPham = sc.nextLine();
        System.out.println("Tên Sản Phẩm :");
        tenSanPham = sc.nextLine();
        System.out.println("Nhập giá sản phẩm :");
        giaSanPham = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng cần nhập :");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mô tả cho sản phẩm");
        moTa = sc.nextLine();

    }

    @Override
    public String toString() {
        return "QuanLySanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", soLuong=" + soLuong + " sản phảm"+
                ", moTa='" + moTa + '\'' +
                '}';
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
if(maSanPham.length() == 10){
    this.maSanPham = maSanPham;
}else{
    System.err.println("Mã sản phẩm không hợp lệ");
}

    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


}
