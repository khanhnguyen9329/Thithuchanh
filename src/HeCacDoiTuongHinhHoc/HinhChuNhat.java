package HeCacDoiTuongHinhHoc;

public class HinhChuNhat extends HinhDang {
    private double width = 1.0;
    private double length = 1.0;

    public HinhChuNhat() {

    }

    public HinhChuNhat(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public HinhChuNhat(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void canh() {
        System.out.println("6canh");
    }

    public void setLength(double length) {
        this.length = length;
    }
}
