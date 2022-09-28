package QuanLyCanBo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhuongThucCanBo {
    ArrayList<CanBo> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n;
    int m;


    public void themCongNhan() {
        System.out.println("Nhập số lượng ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin công nhân thứ " + (i + 1) + ":");
            CongNhan congNhan1 = new CongNhan();
            congNhan1.inputInfo();
            arrayList.add(congNhan1);
        }
    }

    public void themKiSu() {
        System.out.println("Nhập số lượng ");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("nhap thông tin kĩ sư " + (i + 1) + ":");
            KiSu kisu = new KiSu();
            kisu.inputInfo();
            arrayList.add(kisu);

        }

    }

    public void themNhanVien() {
        System.out.println("Nhập số lượng ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ" + (i + 1) + ":");
            NhanVien nhanVien = new NhanVien();
            nhanVien.inputInfo();
            arrayList.add(nhanVien);
        }

    }

    public void showCanBo() {
        for (int i = 0; i < arrayList.size(); i++) {
            // instanceof  kiểm tra xe có phải kiểu dữ lieu công nhân ko
            if (arrayList.get(i) instanceof CongNhan) {
                System.out.println(" Công nhân thu " + (i + 1) + ":");
                // instanceof  kiểm tra xe có phải kiểu dữ lieu KySu ko
            } else if (arrayList.get(i) instanceof KiSu) {

                System.out.println("Kỹ su thứ  " + (i + 1) + ":");
            } else if (arrayList.get(i) instanceof NhanVien) {
                System.out.println("Nhân viên thứ  " + (i + 1) + ":");
            }
            else {
                System.out.println("Cán bộ thứ  " + (i + 1) + ":");
            }
            arrayList.get(i).showInfo();
            System.out.println("------------------------------");
        }
    }
    public void sapXep(){
        // dùng hàm sort để sắp xếp
        Collections.sort(arrayList,new canBoComparator());
        showCanBo();
    }
    public void show1(){
        System.out.println("1. Thêm Công nhân");
        System.out.println("2. Thêm Kỹ Sư");
        System.out.println("3. Thêm Nhan Viên");
        System.out.println("4. Hiển thị");
        System.out.println("5. Sắp xếp");

    }
}
