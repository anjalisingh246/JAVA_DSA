import java.util.*;
public class ArrayList15 {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
          list.add(30);
            list.add(40);
              list.add(50);
              System.out.println("First Array List:"+ list);
              ArrayList<Integer> sec_list = new ArrayList<Integer>();
              sec_list = (ArrayList)list.clone();
              System.out.println("Second ArrayList:" + sec_list);
    }
    
}
