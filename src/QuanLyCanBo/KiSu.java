package QuanLyCanBo;

import java.util.Scanner;

public class KiSu  extends CanBo{
    private String nganhDaoTao;

    public KiSu() {

    }
    public KiSu(String haVaTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(haVaTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên ngành đào tạo :");
        nganhDaoTao = input.nextLine();
    }

    @Override
    public void showInfo() {
       super.showInfo();
        System.out.println("Ngành đào tạo :"+ nganhDaoTao);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        if(nganhDaoTao.length() >= 12){
            this.nganhDaoTao = nganhDaoTao;
        }

    }
}
