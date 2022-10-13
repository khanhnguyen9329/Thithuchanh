package DocGhiFile;

import QuanLySinhVien.QuanLySinhVien1;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class ViDuTapTaoTinThuMuc {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        if (file.isFile()) {
            System.out.println("là file");
        } else {
            System.out.println("not file");
        }

        try {
            PrintWriter pw = new PrintWriter("test.txt");
            pw.println("Xin chào bạn ");
            pw.println("Mình là Khánh");
            pw.println(3.14);
            pw.println('K');
            QuanLySinhVien1 sv = new QuanLySinhVien1(1, "Khánh", 29, "Ha NOi", "abcd");
            QuanLySinhVien1 sv1 = new QuanLySinhVien1(1, "Nam", 29, "Ha NOi", "AAAAAAAAAAAAAAAAAAAAAA");
            pw.println(sv);
            pw.println(sv1);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
