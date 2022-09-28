package QuanLyPhuongTienGiaoThong;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PhuongThuc abc = new PhuongThuc();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            abc.showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    System.err.println("CHỌN PHƯƠNG TIỆN MUỐN THÊM");
                    abc.showPhuongTien();
                    int key;
                    key = Integer.parseInt(scanner.nextLine());
                    switch (key) {
                        case 1:
                            System.err.println("Thêm xe máy");
                            abc.themXeMay();
                            break;
                        case 2:
                            System.err.println("Thêm ô tô");
                            abc.themOTo();
                            break;
                        case 3:
                            System.err.println("Thêm xe tải");
                            abc.themXeTai();
                            break;
                    }
                    break;
                case 2:
                    abc.hienThi();
                    break;
                case 3:
                    System.out.println("Nhập ID cần xóa :");
                    int id = Integer.parseInt(scanner.nextLine());
                    abc.xoa(id);
                    break;
                case 4:
                    System.out.println("NHập ID muốn sửa :");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    abc.sua(id1);

                    break;
                case 5:
                    System.out.println("Tìm kiếm xe theo ");
                    System.out.println("1.Theo Hãng xe");
                    System.out.println("2.Theo màu sắc");
                    int luaChon;
                    luaChon = Integer.parseInt(scanner.nextLine());
                    switch (luaChon) {
                        case 1:
                            System.out.println("Nhập hãng xe muốn tìm");
                            String hangXe = scanner.nextLine();
                            abc.timPhuongTiennTheoHang(hangXe);
                            break;
                        case 2:
                            System.out.println("Nhập màu xe muốn tìm");
                            String mauSac = scanner.nextLine();
                            abc.timPhuongTiennTheoMauSac(mauSac);
                            break;
                    }
                    break;
                case 6:
                    abc.sapXep();
                    abc.hienThi();
                    break;

            }

        } while (choice!=7);


    }

}
