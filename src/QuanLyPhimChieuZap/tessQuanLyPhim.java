package QuanLyPhimChieuZap;

import VongLap.KiemTraSoNguyenTo;

public class tessQuanLyPhim {
    public static void main(String[] args) {
        Ngay day1 = new Ngay(10, 5, 2020);
        Ngay day2 = new Ngay(20, 6, 2022);
        Ngay day3 = new Ngay(30, 7, 2025);

        HangSanXuat HSX1 = new HangSanXuat("HangA", "VietNam");
        HangSanXuat HSX2 = new HangSanXuat("HangB", "Hoa Ki");
        HangSanXuat HSX3 = new HangSanXuat("HangC", "An Do");

        BoPhim boPhim1 = new BoPhim("Bo Gia", 1998, HSX1,70000,day1 );
        BoPhim boPhim2 = new BoPhim("Me Gia", 1999, HSX2,50000,day2 );
        BoPhim boPhim3 = new BoPhim("Anh Gia", 2000, HSX3,270000,day3);

        System.out.println(day1.getNgay()+" "+day1.getThang()+" "+day1.getNam());
        System.out.println(boPhim1.getTenPhim()+" "+ boPhim1.getNamSanXuat()+" "+ HSX1.getTenHangSanXuat()+" "+HSX1.getQuocGia()+" "+ boPhim1.getGiaVe()+" "+day1.getNgay()+" "+ day1.getThang()+" "+ day1.getNam());
        System.out.println(boPhim1.KiemTraGiaVeReHon(boPhim2));
        System.out.println(boPhim2.KiemTraGiaVeReHon(boPhim3));

        System.out.println(boPhim3.layTenHangSanXuat());
    }

}
