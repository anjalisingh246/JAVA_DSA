// remove duplicate elements from linkedlist
package linkedlist;
import java.util.*;
public class LinkedList4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
      ll.add(40);
        ll.add(15);
         ll.add(15);
          ll.add(40);
           ll.add(80);
             ll.add(90);
      System.out.println(ll);
        // Remove duplicates using LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>(ll);
        ll.clear();
        ll.addAll(set);

        System.out.println("List after removing duplicates: " + ll); 
    }
}