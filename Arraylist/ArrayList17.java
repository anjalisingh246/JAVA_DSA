import java.util.*;
public class ArrayList17 {
    public static void main(String args[])
    {
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add("Java is Platform");
        arr.add(14);
         arr.add(1800L);
          arr.add(6.0D);
           arr.add(1.99F);
              System.out.println(" Array List after all insertions:");
              display(arr);
              arr.set(0,50);
               arr.set(1,10.0D);
              System.out.println("ArrayList after modification:" );
              display(arr);
    }
   public static void display(ArrayList<Object>arr){
    for(int i = 0;i<arr.size();i++){
        System.out.println(arr.get(i)+" ");
    }
    System.out.println();
   } 
}

