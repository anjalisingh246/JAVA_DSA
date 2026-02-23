import java.util.*;
public class ArrayList19{
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mango");
        arr.add("Apple");
         arr.add("Banana");
          arr.add("Grapes");
          Collections.sort(arr);
              for(String fruit:arr)
                System.out.println(fruit);
     ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
          list.add(30);
            list.add(40);
              list.add(50);
              Collections.sort(list);
              for(Integer name:list)
              System.out.println(name);
}
}