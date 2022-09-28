package QuanLyPhuongTienGiaoThong;

import java.util.Scanner;

public class OTo extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo() {

    }

    public OTo(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauSac, int soChoNgoi, String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void inPutInfo() {
        Scanner sc = new Scanner(System.in);
        super.inPutInfo();
        System.out.println("Số chỗ ngồi :");
        soChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.println("Kiểu động cơ :");
        kieuDongCo = sc.nextLine();

    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Số lượng ghế ngồi :" + soChoNgoi);
        System.out.println("Kiểu động cơ :" + kieuDongCo+"\n");

    }
}
