package QuanLyCanBo;

import java.util.Scanner;

  public class CanBo  {
    private String hoVaTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String haVaTen, int namSinh, String gioiTinh, String diaChi) {
        this.hoVaTen = haVaTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên :");
        hoVaTen = input.nextLine();
        System.out.print("Nhập năm sinh :");
        while (true) {
            int namSinh = Integer.parseInt(input.nextLine());
            boolean check = setNamSinh(namSinh);
            if (check) {
                break;
            }
        }

        System.out.print("Nhập giới tinh:");

        while (true) {
            String gioiTinh = input.nextLine();
            boolean check = setGioiTinh(gioiTinh);
            if (check) {
                break;
            }
        }
        System.out.print("nhập địa chỉ :");
        diaChi = input.nextLine();
    }

    public void showInfo() {
        System.out.println("tên :" + hoVaTen );
        System.out.println(  "Sinh năm :" + namSinh);
        System.out.println(  "Giới tính :" + gioiTinh);
        System.out.println( "Địa chỉ :" + diaChi);

    }


    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        if (hoVaTen != null) {
            this.hoVaTen = hoVaTen;
        } else {
            System.err.println("Họ Và Tên không đúng");

        }

    }

    public int getNamSinh() {
        return namSinh;
    }

    public boolean setNamSinh(int namSinh) {
        if (namSinh > 1900 && namSinh < 2020) {
            this.namSinh = namSinh;
            return true;
        } else {
            System.err.println("Năm sinh không xác định");
        }
        return false;

    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public boolean setGioiTinh(String gioiTinh) {
        if (gioiTinh.contains("Nam")||gioiTinh.contains("nam") || gioiTinh.contains("Nu")||gioiTinh.contains("nu")) {
            this.gioiTinh = gioiTinh;
            return true;
        } else {
            System.err.println("Giới tính ko xác định");
            return false;
        }

    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


//      @Override
//      public int compareTo(CanBo o) {
//        // so sánh chuỗi String dùng (compareTo)
//          return this.namSinh - o.namSinh;
//      }
  }
