package HinhDang;

import javax.swing.*;

public class Triangle extends SHAPE {

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3, color);

    }

    @Override
    public void DemSoCanh() {
        System.out.println("3 cạnh");
    }
    public void DemSoCanh(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return super.toString()+"123";
    }
}
