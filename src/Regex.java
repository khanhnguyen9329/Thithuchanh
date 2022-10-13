import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("-------MENU--------");
            System.out.println("1.Nhập số diện thoại");
            System.out.println("2.Nhâp gmail");
            System.out.println("3.Nhập tên không cần dấu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
// "^09[0-9]{10,}";

                case 1:
                    System.out.println("Nhập tên không cần dấu");
                    String abc2 = "^09[0-9]{10,}";
                    nhapRegex(abc2);
                    break;
//"^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
                case 2:
                    System.out.println("Nhập tên không cần dấu");
                    String abc1 = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
                    nhapRegex(abc1);
                    break;
// "[a-z A-Z]+";
                case 3:
                    System.out.println("Nhập tên không cần dấu");
                    String abc = "[a-z A-Z]+";
                    nhapRegex(abc);
                    break;
                case 4:

                    break;

            }

        } while (choice != 0);
    }

    public static String nhapRegex(String regex1) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String regex = regex1;
            Pattern pattern = Pattern.compile(regex);
            String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("cho phép");
                return str;
            } else {
                System.out.println("sai định dạng");
            }
        }
    }
}


