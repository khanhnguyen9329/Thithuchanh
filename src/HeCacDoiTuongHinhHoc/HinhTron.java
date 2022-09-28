package HeCacDoiTuongHinhHoc;

public class HinhTron extends HinhDang {
    private double radius = 1.0;

    public HinhTron() {

    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return (radius * radius) * 3.14;
    }

    public double perimeter() {
        return (radius * 2) * 3.14;
    }

    @Override
    public void canh() {
//        super.canh();
        System.out.println("8 cạnh");
    }
}

