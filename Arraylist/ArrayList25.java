//retainALL()
import java.util.*;
public class ArrayList25{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("java","Python","C++"));
           ArrayList<String> list2 = new ArrayList<>(Arrays.asList("C","java"));
       list1.retainAll(list2);
System.out.println(list1);

        } 
}

    
