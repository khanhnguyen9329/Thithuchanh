package HinhTruNew;

public class HinhTru {
    private String color;
    private double radius;
    private double height;

    private static final double PI = 3.14;


    public HinhTru(String color, double radius, double height) {
        this.color = color;
        this.radius = radius;
        this.height = height;

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bottomArea() {
        return (radius * radius) * PI;
    }

    public double cylindricalArea() {
        return 2 * (bottomArea()) * (2 * PI * radius* height);
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                "diện tích đáy"+bottomArea()+
                "Diện tích toàn phần"+cylindricalArea()+
                '}';
    }
}
