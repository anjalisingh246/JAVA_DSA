import java.util.*;
public class ArrayList29{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
         list.add("mango");
          list.add("banana");
           list.add("graphes");
            list.add("orange");
            String search = "mango";
         int index = list.indexOf(search);
         if(index != -1){
            System.out.println(index);
         }
         else{
            System.out.println("element not found");
         }
    }
}
