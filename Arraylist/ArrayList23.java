// ensureCapacity()
import java.util.*;
public class ArrayList23 {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.ensureCapacity(5);
        list.add(23);
          list.add(32);
           list.add(45);
            list.add(63);
            list.add(45);
            list.add(63);
            System.out.println(list);
     System.out.println(list.size());


    }
}
