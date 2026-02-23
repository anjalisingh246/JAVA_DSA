// print sum of linkedlist
package linkedlist;
import java.util.*;
public class LinkedList9 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(100);
         ll.add(30);
          ll.add(20);
           ll.add(50);
           int sum =0;
           for(int i=0;i<ll.size();i++){
           sum+=ll.get(i);
           }
           System.out.println(sum);
    }
}
