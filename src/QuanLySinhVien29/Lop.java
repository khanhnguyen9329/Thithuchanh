package QuanLySinhVien29;

import java.io.Serializable;
import java.util.Scanner;

public class Lop implements Serializable {
    private int id;
    private String TenLop;

    public Lop(int id, String name) {
        this.id = id;
        this.TenLop = name;
    }

    public Lop() {
    }
    public void inPutInfo1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của lớp:");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên lớp :");
        TenLop = scanner.nextLine();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return TenLop;
    }

    public void setName(String name) {
        this.TenLop = name;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "id=" + id +
                ", TenLop='" + TenLop + '\'' +
                '}';
    }
}
