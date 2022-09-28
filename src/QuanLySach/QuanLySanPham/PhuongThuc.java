package QuanLySach.QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class PhuongThuc {
    ArrayList<QuanLySanPham> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n;

    public void themSanPham() {
        System.err.println("Nhập số lượng sản phẩm cần nhập");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1) + ":");
            QuanLySanPham sanPham = new QuanLySanPham();
            sanPham.inputInfo();
            arrayList.add(sanPham);

        }
    }

    public void showSanPham() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Sản phẩm  thứ" + (i + 1) + ":");
            System.out.println(arrayList.get(i).toString());
            ;

        }
        System.out.println("--------------------------------");
    }

    public void xoaSanPham(String maSP) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (maSP.equals(arrayList.get(i).getMaSanPham())) {
                arrayList.remove(i);
            }else{
                System.err.println("Mã sản phẩm không đúng");
                break;
            }
        }

    }

    public void suaSanPham(String maSanPham) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (maSanPham.equals(arrayList.get(i).getMaSanPham())) {
                arrayList.get(i).inputInfo();
            }else{
                System.err.println("Mã sản phẩm không hợp lệ");
                break;
            }

        }

    }

    public void sapXepSanPham() {

    } public void timSanPhamCoGiaCaoNhat() {

    }



}
