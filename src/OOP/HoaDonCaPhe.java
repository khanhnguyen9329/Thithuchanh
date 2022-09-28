package OOP;

public class HoaDonCaPhe {
    private String thuongHieu;
    private double giatienTren1kg;
    private double khoiluong;

    public HoaDonCaPhe(String TH, double GiaTien1kg, double kl) {
        this.thuongHieu = TH;
        this.giatienTren1kg = GiaTien1kg;
        this.khoiluong = kl;

    }
    public double TinhTongTien(){
        return this.giatienTren1kg* this.khoiluong;

    }
    public boolean KiemTraKhoiLuongLonHon(double khoiluongx){
        if(this.khoiluong > khoiluongx){
            return true;
        }else{
            return false;
        }
    }
    public boolean KTTongtiencolonHon500k(){
        return this.TinhTongTien() > 500000;
    }
    public double GiamGia(double x){
        if(TinhTongTien()>=500000){
            return (x/100) * TinhTongTien();
        }else {
            return 0;
        }

    }
    public double SoTienSauKhiGiamGia(double x){
        return TinhTongTien() - GiamGia(x);

    }
}
