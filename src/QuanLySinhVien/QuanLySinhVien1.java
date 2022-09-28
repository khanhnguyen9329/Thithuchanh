package QuanLySinhVien;

public class QuanLySinhVien1 {
     int id;
     String name;
    int age;
     String address;
    String gmail;

    public QuanLySinhVien1() {
    }
    public QuanLySinhVien1(int id, String name, int age, String address, String gmail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gmail = gmail;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age >0 && age <100)  {
            this.age = age;
        }else {
            System.err.println("Bất khả thi");
        }

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "QuanLySinhVien1{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", address=" + address +
                ", gmail=" + gmail +
                '}';
    }
}
