package OOP;

import java.util.Scanner;

public class HoaDonCaPhe_Test {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("TrungNguyen",500000,2);
        System.out.println("TỔng tiền :"+ hd.TinhTongTien());
        System.out.println("KTKhoiLuong có lớn hơn "+"  " + hd.KiemTraKhoiLuongLonHon(1) );
        System.out.println("kt tổng tiền có lớn hơn 500k"+" "+ hd.KTTongtiencolonHon500k());
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số % muốn giảm");
        double a = sc.nextDouble();
        System.out.println("Giảm Giá" +" "+ hd.GiamGia(a) );
        System.out.println("SỐ tiền sau khi giảm còn :"+ hd.SoTienSauKhiGiamGia(a));
    }
}
