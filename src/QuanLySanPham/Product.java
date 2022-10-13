package QuanLySanPham;


public class Product {
    private int code;
    private String name;
    private double price;
    private int amount;
    private String moTa;


    public Product(int code, String name, double price, int amount, String moTa) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.moTa = moTa;


    }

    public double pricing(){   //tính giá sản phẩm.
        return price * amount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product" +" " + "MãSảnPhẩm :"+code +" " + "Tên sản phẩm : "+name + "   "+"Giá" + price + "  " + "Số lượng :"+amount +"  " +"Mô tả :"+moTa;
    }
}

