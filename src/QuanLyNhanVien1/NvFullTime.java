package QuanLyNhanVien1;

public class NvFullTime extends QuanLyNhanVien {
    private double luong;


    public NvFullTime() {
    }

    public NvFullTime(int id, String name, int age, String address, double luong) {
        super(id, name, age, address);
        this.luong = luong;
    }

  public void hienThiLuong(){
      System.out.println("Lương NV full time :"+ luong);
  }

    @Override
    public String toString() {
        return super.toString();

    }
}
