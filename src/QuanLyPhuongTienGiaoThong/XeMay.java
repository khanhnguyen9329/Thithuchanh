package QuanLyPhuongTienGiaoThong;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong {
    private int congSuat;

    public XeMay() {

    }

    public XeMay(int id, String hangSanXuat, int namSanXuat, double giaBan, String mauSac, int congSuat) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauSac);
        this.congSuat = congSuat;
    }

    @Override
    public void inPutInfo() {
        Scanner sc = new Scanner(System.in);
        super.inPutInfo();
        System.out.println("Công suất :");
        congSuat = Integer.parseInt(sc.nextLine());
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Công suất :" + congSuat+"\n");

    }
}
