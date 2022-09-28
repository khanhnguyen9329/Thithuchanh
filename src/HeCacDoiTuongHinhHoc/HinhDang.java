package HeCacDoiTuongHinhHoc;

public class HinhDang {
    private String color = "red";
    private boolean filled = true;

    public HinhDang() {
    }

    public HinhDang(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void canh() {
        System.out.println("4 canh");
    }

    public void canh(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "HinhDang{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
