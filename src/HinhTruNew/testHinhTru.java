package HinhTruNew;

public class testHinhTru {
    public static void main(String[] args) {
        HinhTron2 htron = new HinhTron2("red",10,20);
        System.out.println(htron.bottomArea());
        System.out.println(htron.toString());
        htron.setColor("mau xanh");
        System.out.println(htron.getColor());


        HinhTru ht = new HinhTru("pink",20,40);
        System.out.println(ht.bottomArea());
        System.out.println(ht.toString());

    }
}
