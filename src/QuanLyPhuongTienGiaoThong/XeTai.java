package QuanLyPhuongTienGiaoThong;

import java.util.Scanner;

public class XeTai extends PhuongTienGiaoThong {
    private int trongTai;

    public XeTai() {

    }

    public XeTai(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauSac, int trongTai) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
        this.trongTai = trongTai;
    }

    @Override
    public void inPutInfo() {
        Scanner sc = new Scanner(System.in);
        super.inPutInfo();
        System.out.println("Nhập trọng tải :");
        trongTai = Integer.parseInt(sc.nextLine());
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Trọng tải :" + trongTai+"\n");

    }
}
