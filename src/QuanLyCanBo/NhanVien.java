package QuanLyCanBo;

import java.util.Scanner;

public class NhanVien extends CanBo {
     String thongTinCongViec;

    public NhanVien() {
    }

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhập thông tin công việc :");
        thongTinCongViec = scanner.nextLine();

    }

    @Override
    public void showInfo() {
        super.showInfo() ;
        System.out.println( "Tiến độ công việc :" +" "+ thongTinCongViec);
    }

    public String getThongTinCongViec() {
        return thongTinCongViec;
    }

    public void setThongTinCongViec(String thongTinCongViec) {
        this.thongTinCongViec = thongTinCongViec;
    }
}
