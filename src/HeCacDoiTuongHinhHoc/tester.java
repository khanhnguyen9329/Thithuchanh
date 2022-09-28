package HeCacDoiTuongHinhHoc;

public class tester {
    public static void main(String[] args) {
        HinhDang hd = new HinhDang();
        HinhDang hd1= new HinhDang("blue",false);
        System.out.println(hd1.getColor());
        hd1.setColor("12345");
        System.out.println(hd1.getColor());
        System.out.println(hd1.isFilled());
        hd.canh("100 cạnh");


        HinhTron ht = new HinhTron();
        System.out.println(ht.getColor());
        System.out.println(ht.isFilled());
        System.out.println(ht.toString());
        ht.canh();

        HinhTron ht1 = new HinhTron(10);
        System.out.println("Diện tích :"+ht1.Area());
        System.out.println("Chu vi"+ht1.perimeter());


        HinhChuNhat hcn = new HinhChuNhat();
       hcn.canh();


        System.out.println(hcn.getColor());
        System.out.println(hcn.isFilled());
        System.out.println(hcn.getWidth());
        hcn.setWidth(20);
        System.out.println(hcn.getWidth());
        System.out.println(hcn.getLength());
    }
}
