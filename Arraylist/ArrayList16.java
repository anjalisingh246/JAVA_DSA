
import java.util.*;
public class ArrayList16 {
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(67);
          list.add(98);
            list.add(100);
              System.out.println(" Array List:"+ list);
             Object arr = list.toArray();
              System.out.println("Elements OF ArrayList:" + "as Array:"+ 
              Arrays.toString(arr));
              
    }
    
}

