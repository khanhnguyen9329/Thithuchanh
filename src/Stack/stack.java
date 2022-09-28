package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

//        stackChuoi.push("giá trị") ==> đưa gi trị vào stack
//        stackChuoi.pop() ==>Lấy giá trị ra xóa khỏi stack
//        stackChuoi.peek() ==>Lấy giá trị ra, và không xóa khỏi stack
//        stackChuoi.clear() ==> Xóa tất cả phần tử trong stack
//        stackChuoi.contains("giá trị") ==> xác định giá trị có tồn tại trong pần tử hay không
//        stackChuoi.size() ==> độ lớn của stack

//        System.out.println("Nhập vào một chuỗi bất kì");
//        String n = scanner.nextLine();
//        for (int i = 0; i < n.length(); i++) {
//            stackChuoi.push(n.charAt(i) + "");
//
//        }
//        System.out.println("chuỗi đảo ngược");
//        for (int i = 0; i < n.length(); i++) {
//            System.out.print(stackChuoi.pop());
//        }
// chuyển từ hệ thập phân sang nhị phân
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("nhập 1 số nguyên từ bàn phím ");
        int x = scanner.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu + "");
            x = x / 2;
        }
        System.out.println("số nhị phân là:");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());

        }

    }
}
