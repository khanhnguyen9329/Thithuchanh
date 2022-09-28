package Stack;

import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong = new HashSet<>();

    public RutThamTrungThuong_HashSet() {
    }
public boolean themPhieu(String giaTri){
      return this.thungPhieuDuThuong.add(giaTri)       ;

}
public boolean kieuTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
}
public int laySoLuong(){
        return this.thungPhieuDuThuong.size();

}
public String rutMotPhieu(){
        String ketQua = "";
    Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
}
public void xoaTatcaPhioeuTrungThuong(){
        this.thungPhieuDuThuong.clear();
}

public void inTatCa(){
    System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
}


public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
}



    public static void main(String[] args) {
        int luaChon;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        do{
            System.err.println("---------------------");
            System.out.println("MENNU");
            System.out.println("1.Thêm số dự thưởng");
            System.out.println("2.Xóa mã số dự thưởng");
            System.out.println("3.Kiểm tra mã số dự thưởng có tồn taị hay không");
            System.out.println("4. Xóa tất cả phiếu dự thưởng");
            System.out.println("5: Số lượng phiếu dự thưởng");
            System.out.println("6: Rút thăm trúng thưởng");
            System.out.println("7: in tất cả các phiếu");
            System.out.println("0.thoát khỏi chuong trình");

            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1 || luaChon==2 || luaChon ==3){
                System.out.println("Nhập vào mã phiếu dự thưởng");
                String giaTri = sc.nextLine();
                if(luaChon==1){
                    rt.themPhieu(giaTri);
                } else if (luaChon==2) {
                    rt.xoaPhieu(giaTri);

                }else {
                    System.out.println("Kết quả kiểm tra :"+ rt.kieuTraPhieuTonTai(giaTri));
                }
                }else if(luaChon==4){
                rt.xoaTatcaPhioeuTrungThuong();
            } else if (luaChon==5) {
                System.out.println("Số lương Phiếu là :"+rt.laySoLuong());
            }else if(luaChon==6){
                System.out.println("mã số trung thưởng là :"+ rt.rutMotPhieu());
            } else if (luaChon==7) {
                System.out.println("các mã phiếu trúng thưởng là :");
                 rt.inTatCa();

            }


        }while (luaChon !=0);
    }
}
