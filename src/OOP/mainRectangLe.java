package OOP;

import java.util.Scanner;

public class mainRectangLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap chiêu rông ");
        double wight = sc.nextDouble();
        System.out.println("Nhap chiều dài");
        double height = sc.nextDouble();
        Rectangle HCN = new Rectangle(wight,height);
        System.out.println( HCN.display());
        System.out.println("Chu vi hình chữ nhật"+ HCN.getPerimeter());
        System.out.println("Diện tích HCN ="+ HCN.getArea()); ;

    }
}
