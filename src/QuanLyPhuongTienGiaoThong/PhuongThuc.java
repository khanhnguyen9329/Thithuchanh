package QuanLyPhuongTienGiaoThong;

import java.util.ArrayList;
import java.util.Collections;

public class PhuongThuc {

    ArrayList<PhuongTienGiaoThong> array = new ArrayList<>();

    public void showMenu(){
        System.out.println("MENU");
        System.out.println("1.Thêm phương tiện");
        System.out.println("2.Hiển thị danh sách phương tiện");
        System.out.println("3.Xóa theo ID");
        System.out.println("4.Sửa theo ID ");
        System.out.println("5.Tìm phương tiện theo Hãng và Màu");
        System.out.println("6.Sắp xếp phương tiện theo ID");
        System.out.println("7.Thoát chương trình");
        System.err.println("---------------------");
    }

    public void showPhuongTien(){
        System.out.println("1.Xe máy");
        System.out.println("2.Ô Tô");
        System.out.println("3.Xe tải");
    }
    public void themXeMay(){
      XeMay xeMay = new XeMay();
      xeMay.inPutInfo();
      array.add(xeMay);
    }
    public void themOTo(){
     OTo oto = new OTo();
      oto.inPutInfo();
      array.add(oto);
    }
    public void themXeTai(){
        XeTai xeTai = new XeTai();
        xeTai.inPutInfo();
        array.add(xeTai);
    }
    public void hienThi() {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof XeMay) {
                System.out.println("Xe máy ");
            } else if (array.get(i) instanceof XeTai) {
                System.out.println("Xe tải ");
            } else if (array.get(i) instanceof OTo) {
                System.out.println("Ô tô ");
            } else {
                System.out.println(" xe " + (i + 1));
            }
               array.get(i).showInfo();
        }
    }
    public void xoa(int ID){
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getId() == ID){
                array.remove(i);

            }else{
                System.err.println("ID không hợp lệ");
            }

        }
    }
    public void sua( int ID){
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getId() == ID){
                array.get(i).inPutInfo();
            }else{
                System.err.println("ID không hợp lệ");
            }

        }

    }
    public void timPhuongTiennTheoHang(String hangXe){
        for (int i = 0; i < array.size(); i++) {
            if(hangXe.equals( array.get(i).getHangSanXuat() )){
                array.get(i).showInfo();
            }else{
                System.err.println("Hãng sản xuất không hợp lệ");
            }

        }

    }
    public void timPhuongTiennTheoMauSac(String hangXe){
        for (int i = 0; i < array.size(); i++) {
            if(hangXe.equals( array.get(i).getMauSac() )){
                array.get(i).showInfo();
            }


        }

    }
    public void sapXep(){
        Collections.sort(array,new PhuongTienGiaThongComparator());
        hienThi();
    }
}
