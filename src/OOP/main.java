package OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MyDate ngaythangnam = new MyDate(3,3,2020);
        System.out.println(ngaythangnam.getDay());
        Scanner sc = new Scanner(System.in);
        int abc = sc.nextInt();
        ngaythangnam.setDay(abc);
        System.out.println(ngaythangnam.getDay());
    }



}
