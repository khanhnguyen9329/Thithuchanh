package QuanLySach;

public class testQuanLySach {
    public static void main(String[] args) {
       Ngay ngay1 = new Ngay(29,7,1993);
        Ngay ngay2 = new Ngay(29,7,1998);
        Ngay ngay3 = new Ngay(10,8,2021);

        TacGia tacGia1 = new TacGia("Khanh",ngay1);
        TacGia tacGia2 = new TacGia("Thủy",ngay2);
        TacGia tacGia3 = new TacGia("Mit",ngay3);

        Sach sach1= new Sach("Con Ong Vàng",5000,2000,tacGia1);
        Sach sach2= new Sach("Con Ong Xanh",10000,2010,tacGia2);
        Sach sach3= new Sach("Con Ong Đỏ",15000,2021,tacGia3);

        System.out.println(sach1.toString());
       sach2.inTenSach();
       sach3.inTenSach();
        System.out.println(sach1.giaBanSauKhiGiam(10));
        System.out.println(sach2.giaBanSauKhiGiam(20));
        System.out.println(sach3.giaBanSauKhiGiam(50));
        System.out.print (sach1.inTenCuaTacGia());
        System.out.println(ngay2.toString());


    }
}
