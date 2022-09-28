package Stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> danhSachSV=  new PriorityQueue<>();

         danhSachSV.offer("C");
         danhSachSV.offer("A");
         danhSachSV.offer("B");

     while (true){
         String ten = danhSachSV.poll();
         if(ten== null){
             break;
         }
         System.out.println(ten);
     }

    }
}
