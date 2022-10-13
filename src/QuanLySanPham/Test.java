package QuanLySanPham;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validate validate =new Validate();
        PhuongThuc phuongThuc = new PhuongThuc();
        int choice;
        do {
            validate.showMenu();
            choice = validate.checkChoice();
            switch (choice){
                case 1:
                    phuongThuc.showInfo();
                    break;
                case 2:
                    phuongThuc.inPutInfo();
                    break;
                case 3:
                    phuongThuc.update();
                    break;
                case 4:
                    phuongThuc.delete();
                    break;
                case 5:
                    phuongThuc.sort();
                    break;
                case 6:
                    break;
                case 7:
                    phuongThuc.ReadFromFile();
                    phuongThuc.showInfo();
                    break;
                case 8:
                    phuongThuc.WriteToFile();
                    break;
                default:
                    System.err.println("Nhập sai ");
            }



        } while (choice !=0);

    }


}
