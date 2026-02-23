package linkedlist;
import java.util.*;
public class LinkedList15 {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.offer("anjali");
         list.offer("Priya");
          list.offer("Vaishali");
           list.offer("Riya");
           list.offerFirst("seeta");
            list.offerLast("Sneha");
            System.out.println("passenger List" + list);
            System.out.println(list.peek());
                    System.out.println(list.peekFirst());
                            System.out.println(list.peekLast());
    }
}
