package MAP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
          TuDien tuDien = new TuDien();
          int luaChon ;
        Scanner sc = new Scanner(System.in);

        do{
            System.err.println("--------------------");
            System.out.println("MENU");
            System.out.println("Tra từ điển Anh - Việt \n"
                    +"1. Thêm từ \n"
                    +"2.Xóa từ \n"
                    +"3.Tra từ \n"
                    +"4.In ra số lượng \n"
                    +"5.Xóa tất cả từ khóa \n"
                    + " "
            );
            luaChon =sc.nextInt(); sc.nextLine();
            switch (luaChon){
                case 1:
                    System.out.println("Nhập từ khóa:");
                    String tukhoa = sc.nextLine();
                    System.out.println("Nhập ý nghĩa :");
                    String yNghia = sc.nextLine();
                    tuDien.themTu(tukhoa,yNghia);
                    break;
                case 2:

            }




        }while (luaChon!=0);
    }
}
