import java.util.*;
public class ArrayList28 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
         list.add(88);
          list.add(235);
           list.add(3);
            list.add(10);
            System.out.println(list);
    int largest = list.get(0);
    for(int i = 1; i<list.size(); i++){
        if(list.get(i)> largest)
{
    largest = list.get(i);
}
    }
        System.out.println(largest);
    }

}
