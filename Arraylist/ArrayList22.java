
import java.util.*;
public class ArrayList22 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ram");
          name.add("Mohan");
           name.add("Rani");
            name.add("John");
            name.removeIf(names->names.startsWith("R"));
            for(String i:name){
                System.out.println(i);
            }

    }
}
