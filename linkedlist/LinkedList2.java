// find the middle element
package linkedlist;
import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
  LinkedList<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(15);
          ll.add(20);
           ll.add(50);
          ll.add(90);
      System.out.println(ll);
      int a =ll.size();
      int b = a/2;
      System.out.println(ll.get(b));
        
    }
}

    

