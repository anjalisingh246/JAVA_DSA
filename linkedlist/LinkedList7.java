// Merge two linkedlist
package linkedlist;
import java.util.*;
public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(30);
         ll.add(40);
          ll.add(50);
           ll.add(60);
            ll.add(70);
            System.out.println(ll);
     LinkedList<Integer> ll2 = new LinkedList<>();
     ll.add(310);
         ll.add(420);
          ll.add(500);
           ll.add(660);
            ll.add(790);
            ll2.addAll(ll);
            System.out.println(ll2);

    }
}
