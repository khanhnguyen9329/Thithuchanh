package ThuVienSach;

import java.util.Scanner;

public class TheMuonSach {
    private int maSoPhieuMuon;
    private String ngayMuon;
    private String Ngaytra;
    private SinhVien thongTinSinhVien = new SinhVien();

    public TheMuonSach() {
    }

    public TheMuonSach(SinhVien thongTinSinhVien, String ngayMuon, String ngaytra, int maSoPhieuMuon) {
        this.maSoPhieuMuon = maSoPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.Ngaytra = ngaytra;
        this.thongTinSinhVien = thongTinSinhVien;
    }

    public void inPut() {
        thongTinSinhVien.inPutInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã số phiếu :");
        maSoPhieuMuon = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày mượn");
        ngayMuon = scanner.nextLine();
        System.out.println("Ngày trả :");
        Ngaytra = (scanner.nextLine());

    }


    public int getMaSoPhieuMuon() {
        return maSoPhieuMuon;
    }

    public void setMaSoPhieuMuon(int maSoPhieuMuon) {
        this.maSoPhieuMuon = maSoPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgaytra() {
        return Ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        Ngaytra = ngaytra;
    }

    public SinhVien getThongTinSinhVien() {
        return thongTinSinhVien;
    }

    public void setThongTinSinhVien(SinhVien thongTinSinhVien) {
        this.thongTinSinhVien = thongTinSinhVien;
    }

    @Override
    public String toString() {

        return "ThongTinSinhVien=" + thongTinSinhVien +
                "TheMuonSach{" +
                "Mã số phiếu mượn sách=" + maSoPhieuMuon +
                ",Ngày mượn=" + ngayMuon +
                ", Ngày trả =" + Ngaytra +

                '}';
    }
}
