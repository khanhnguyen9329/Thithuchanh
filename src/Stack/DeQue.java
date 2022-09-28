package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeQue {
    public static void main(String[] args) {

        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("C");
        danhSachSV.offer("A");
        danhSachSV.offer("B");
        danhSachSV.offerLast("Khánh");
        danhSachSV.offerFirst("Nguyễn");

        while (true){
            String ten = danhSachSV.poll();
            if(ten== null){
                break;
            }
            System.out.println(ten);
        }

    }
}
