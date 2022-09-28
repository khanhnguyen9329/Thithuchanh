package OOP;

public class MayTinh {
    String mau;
    String hang;
    int gia;

    public MayTinh(String mau, String hang, int gia) {
        this.mau = mau;
        this.hang = hang;
        this.gia = gia;

    }
}
class show{
    public static void main(String[] args) {
        MayTinh khanh = new MayTinh("vang","HP",5000);
        System.out.println(khanh.mau+","+khanh.gia+","+khanh.hang);
    }
}



