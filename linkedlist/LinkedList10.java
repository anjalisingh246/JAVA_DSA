package linkedlist;
import java.util.*;
public class LinkedList10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

      list.add(10);
        list.add(100);
          list.add(20);
            list.add(30);
              list.add(20);
                list.add(10);
                 list.add(20);
                    list.add(30);
                       list.add(400);

        System.out.println("LinkedList: " + list);

        // Element to find frequency
        System.out.print("Enter element to find frequency: ");
        int element = sc.nextInt();

        // Using Collections.frequency()
        int freq = Collections.frequency(list, element);

        System.out.println("Frequency of " + element + " = " + freq);

        sc.close();
    }
}