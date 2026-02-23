import java.util.*;
public class ArrayList18 {
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Mango");
        arr.add("Apple");
         arr.add("Banana");
          arr.add("Grapes");
              System.out.println(" Returning Element:" + arr.get(1)); {
              }
              arr.set(1,"dates");
              for(String fruit:arr)
                System.out.println(fruit);
}
}