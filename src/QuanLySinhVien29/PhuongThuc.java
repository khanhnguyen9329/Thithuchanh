package QuanLySinhVien29;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PhuongThuc {
    ArrayList<HocVien> danhSach = new ArrayList<>();

    public void themHocVien() {
        HocVien hocVien = new HocVien();
        hocVien.inPutInfo();
        danhSach.add(hocVien);
    }

    public void hienThihocVien() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i).toString());
        }
    }

    public void xoaDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số Id muốn xóa");
        int a = scanner.nextInt();
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getThongTinLop().getId() == a) {
                danhSach.clear();
            } else {
                System.err.println("ID không hợp lệ");
            }

        }

    }

    public void show() {
        System.out.println("1.Thêm");
        System.out.println("2.Hiển Thị");
        System.out.println("3. Xóa theo ID");
        System.out.println("4.Lưu danh sách học viên xuống tập tin");
        System.out.println("5.Đọc file ");
    }

    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            for (HocVien hv : danhSach) {
                objectOutputStream.writeObject(hv);
            }
            objectOutputStream.writeObject(null);

            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void docDuLieuFile(File file) {
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            HocVien hv = null;
            while (true) {
                Object oj = objectInputStream.readObject();
                if (oj == null) {
                    break;

                } if(oj != null){
                    hv = (HocVien) oj;
                    this.danhSach.add(hv);
                }
            }
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
