package QuanLyNhanVien1;

public class NvPartime extends QuanLyNhanVien {
    private int ngayDiLam;
    private int luong1ngaydilam = 120000;

    public NvPartime() {

    }

    public NvPartime(int id, String name, int age, String address, int ngayDiLam) {
        super(id, name, age, address);
        this.ngayDiLam = ngayDiLam;
    }
    public double tongLuong(){
        return luong1ngaydilam * ngayDiLam;
    }

    @Override
    public String toString() {
        return super.toString()+
                "tổng lương"+tongLuong();
    }
}
