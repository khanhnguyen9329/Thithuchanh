package QuanLyCanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private double capBac;

    public CongNhan() {
    }
    public CongNhan(String haVaTen, int namSinh, String gioiTinh, String diaChi, double capBac) {
        super(haVaTen, namSinh, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public double getCapBac() {
        return capBac;
    }

    public void setCapBac(double capBac) {
        this.capBac = capBac;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cấp bậc :");
        capBac = Double.parseDouble(input.nextLine());
    }

    @Override
    public void showInfo() {
       super.showInfo();
        System.out.println("Cấp bậc :"+ capBac);
    }
}
