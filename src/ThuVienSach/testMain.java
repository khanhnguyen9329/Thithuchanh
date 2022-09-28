package ThuVienSach;

import java.time.LocalDateTime;
import java.util.*;

public class testMain {

    public static void main(String[] args) {
        LocalDateTime thoiGian = LocalDateTime.now();
        System.out.println(thoiGian);
        Scanner scanner = new Scanner(System.in);
        ArrayList<TheMuonSach> theMuonSachArray = new ArrayList<>();
        TheMuonSach theMuonSach;


        int choice;
        do {
            System.out.println("1.Thêm ");
            System.out.println("2.Hiển thị");
            System.out.println("3. Tìm kiếm");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    theMuonSach = new TheMuonSach();
                    theMuonSach.inPut();
                    theMuonSachArray.add(theMuonSach);
                    break;
                case 2:
                    for (int i = 0; i < theMuonSachArray.size(); i++) {
                        System.out.println(theMuonSachArray.get(i).toString());
                    }
                    break;

                case 3:
                    System.out.println("Nhập ngày");
                    String ngay = scanner.nextLine();
                    for (int i = 0; i < theMuonSachArray.size(); i++) {
                        if (theMuonSachArray.get(i).getNgaytra().equals(ngay)) {
                            System.out.println(theMuonSachArray.get(i).toString());
                        }

                    }


                    break;
            }

        } while (choice != 0);


    }


}
