package QuanLySanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class PhuongThuc {
    Validate validate = new Validate();
    ArrayList<Product> products1 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public final String sdtValidate = "^[0-9]{10}$";
    public final String MaSanPham = "^[0-9]{5}$";
    public final String abc1 = "[a-z]{5,}";
    Product products;

    public Product inPutInfo() {

        System.out.println("Nhập mã code ");
        int code = validate.checkCode();

//        System.out.println("Nhập sdt: ");
//        String sdt = validate.checkValidate(sdtValidate);

//        System.out.println("Nhập tên ");
//        String name = validate.checkValidate(abc1);

        System.out.println("Nhập tên ");
        String name = scanner.nextLine();

        System.out.println("nhập giá :");
        double price = validate.checkGia();

        System.out.println("nhập số lượng :");
        int amount = validate.amount();

        System.out.println("Nhập mô tả");
        String moTa = scanner.nextLine();
        Product products = new Product(code, name, price, amount, moTa);
        products1.add(products);

        return products;
    }

    public void showInfo() {
        for (Product n : products1) {
            System.out.println(n);
        }
    }

    public void update() {
        System.out.println("Nhập mã code sản phẩm muốn xóa");
        int code = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products1.size(); i++) {
            if (products1.get(i).getCode() == code) {
               products1.set(i,inPutInfo()) ;
            }

        }
    }
    public void delete(){
        System.out.println("Nhập mã sản phẩm cần xóa");
        int code1 =  Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products1.size(); i++) {
            if(products1.get(i).getCode() == code1){
                products1.clear();
            }else {
                System.out.println("mã sản phẩm không tồn tại");
            }

        }
    }
    public void sort() {
        int choose = 2;
        System.out.println("1. Giá tăng dần");
        System.out.println("2. Giá giảm dần");
        System.out.println("Nhập số để lựa chọn: ");
        do {
            if (choose > 2) System.out.println("Vui lòng nhập lại");
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose > 2);

        switch (choose) {
            case 1 -> ascending();
            case 2 -> decrease();
        }
    }


    public void ascending() {
        Product temp;
        for (int i = 0; i < products1.size() - 1; i++) {
            for (int j = i + 1; j < products1.size(); j++) {
                if (products1.get(i).getPrice() > products1.get(j).getPrice()) {
                    temp = products1.get(i);
                    products1.set(i, products1.get(j));
                    products1.set(j, temp);
                }
            }
        }
        showInfo();

    }

    public void decrease() {
        Product temp1;
        for (int i = 0; i < products1.size() - 1; i++) {
            for (int j = i + 1; j < products1.size(); j++) {
                if (products1.get(i).getPrice() < products1.get(j).getPrice()) {
                    temp1 = products1.get(i);
                    products1.set(i, products1.get(j));
                    products1.set(j, temp1);
                }
            }
        }

        showInfo();

    }
    public void ReadFromFile() {
        products1 = IO.read();
    }


    public void WriteToFile() {

        IO.write(products1);
    }
    public void findTheMostExpensiveProduct() {
        double max = products1.get(0).getPrice();
        for (int i = 1; i < products1.size(); i++) {
            if (max < products1.get(i).getPrice()) {
                max = products1.get(i).getPrice();
            }
        }
        for (Product product : products1) {
            if (max == product.getPrice()) {
                String str = product.toString();
                System.out.println(str);
            }
        }
    }


}
