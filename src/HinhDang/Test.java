package HinhDang;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh 1");
        int side1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh 2");
        int side2 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cạnh 3");
        int side3 = Integer.parseInt(sc.nextLine());
        System.out.println("nhập màu sắc");
        String color = sc.nextLine();

        Triangle htg = new Triangle(side1, side2, side3, color);
        System.out.println(htg.trianglePerimeter());

        htg.DemSoCanh();
        htg.DemSoCanh("10canh");
        System.out.println( htg.toString());


        System.out.println("------------");
        SHAPE htg1 = new Triangle();
        htg1.DemSoCanh();
        System.out.println(htg1.toString());

        SHAPE hd = new SHAPE();
        System.out.println(hd.toString());



    }
}
