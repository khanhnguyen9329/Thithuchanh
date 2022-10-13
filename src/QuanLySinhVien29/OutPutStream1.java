package QuanLySinhVien29;

import java.io.*;

public class OutPutStream1 {
    public static void main(String[] args) {
        File file = new File("Demo.txt");

        try {
            OutputStream outputStream = new FileOutputStream(file,true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            HocVien hv = new HocVien("Khán",19,"Nam",123456778,"đasa",new Lop(1,"khanh"));
            objectOutputStream.writeObject(hv);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("Lỗi");
        }



    }


}
