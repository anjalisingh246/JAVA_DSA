package linkedlist;
import java.util.*;
public class LinkedLsit14 {
    public static void main(String args[]){
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("ram");
        list1.add("Mohan");
        list1.add("John");
        System.out.println("first lidt is:" + list1);
        list1.addFirst("Sweta");
            list1.addFirst("Geeta");
                list1.addLast("radha");
                    list1.addLast("Rani");
      LinkedList<String> list2 = new LinkedList<>();   
      list2.add("priya");
      list2.add("Anjali");             
                       list1.addAll(list2);
                       System.out.println("Second List is:" + list2);
                       System.out.println("normal list");
                       Iterator itr = list1.descendingIterator();
                       while(itr.hasNext()){
                        System.out.println(itr.next());
                       }

    }
}
