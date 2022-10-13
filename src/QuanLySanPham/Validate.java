package QuanLySanPham;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Scanner scanner = new Scanner(System.in);
    public int checkChoice() {
        while (true){
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice < 10) {
                    return choice;
                } else {
                    System.out.println("Mời bạn nhập lại");
                }
            } catch (Exception e) {
                System.out.println("Lỗi định dạng");
            }

        }
        }


    public int checkCode() {
        while (true) {
            try {
                int code = Integer.parseInt(scanner.nextLine());
                if (code > 0 && code < 50) {
                    return code;
                } else {
                    System.out.println("Phải nhỏ hơn 50!");
                }
            } catch (Exception e) {
                System.out.printf("Lỗi validate!");
            }

        }
    }

    public double checkGia() {
        while (true) {
            try {
                double price = Double.parseDouble(scanner.nextLine());
                if (price > 0) {
                    return price;
                } else {
                    System.out.println("Giá không hợp lý");
                }
            } catch (Exception e) {
                System.out.println("Lỗi định dạng" +
                        "Mời bạn nhập lại \n");
            }
        }
    }

    public int amount() {
        while (true) {
            try {
                int amount = Integer.parseInt(scanner.nextLine());
                return amount;
            } catch (Exception e) {
                System.out.println("lỗi Exception");
            }
        }
    }

    public String checkValidate(String regex) {
        while (true) {
            Pattern pattern = Pattern.compile(regex);
            String sdt = scanner.nextLine();
            Matcher matcher = pattern.matcher(sdt);
            if (matcher.matches()) {
                System.out.println("------------");
                return sdt;
            } else {
                System.out.println("sai định dạng");

            }
        }
    }



    public void showMenu() {
        System.out.println("-------MENU-------");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Sửa");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm sản phẩm có giá đắt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi vào File");
        System.out.println("9. Thoát");

    }

}
