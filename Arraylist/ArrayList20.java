import java.util.*;
public class ArrayList20 {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("abs","gfh","hfgf","ygf","hfgh"));
        System.out.println("Original List:" + names);
        // create subList from index 1 to 4(excluded)
        List<String> sub = names.subList(1,4);
        System.out.println("sub List:" + sub);
    }
    
}
