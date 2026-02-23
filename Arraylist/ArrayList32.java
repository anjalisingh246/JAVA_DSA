// remove duplicate elements
import java.util.ArrayList;
public class ArrayList32 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");
        list.add("Apple");
    String search = "Apple";
    int count = 0;
System.out.println(list);
for(int i=0;i<list.size();i++){
        if(list.get(i) == search){
           count++;
}
        
    }
        System.out.print("occurence of apple"+ count);
    }
}


