//delete even numbers
package linkedlist;
import java.util.*;
public class LinkedList8 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(15);
         ll.add(3);
          ll.add(20);
           ll.add(50);
      System.out.println(ll);
           for(int i=ll.size()-1;i>=0;i--){
           if(ll.get(i)%2==0){
         int b=ll.remove(i);
          System.out.println("removed elements are:"+b);
           }
           }
            System.out.println(ll);
        
    }
}
