package HinhDang;

public class SHAPE {
    private double side1 =1;
    private double side2 =1;
    private double side3 =1;

    private String color = "red";

    public SHAPE() {
    }

    public SHAPE(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double trianglePerimeter() {
        return  this.side1 + this.side2 + this.side3;
    }
    public void DemSoCanh(){
        System.out.println("5 cạnh");
    }

    @Override
    public String toString() {
        return "SHAPE{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
