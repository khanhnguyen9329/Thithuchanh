package QuanLySanPham;


import java.io.*;
import java.util.ArrayList;

public class IO {
    static File file = new File("khanh.txt");

    public static void write(ArrayList<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : products) {
                String s = product.getCode() +"," + product.getName()+ "," + product.getPrice() +"," + product.getAmount() + "," + product.getMoTa();
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> read() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                int code = Integer.parseInt(arr[0]);
                String name = arr[1];
                double price = Double.parseDouble((arr[2]));
                int quantity = Integer.parseInt(arr[3]);
                String describe = arr[4];

                Product product = new Product(code, name, price, quantity, describe);
                products.add(product);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}