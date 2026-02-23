import java.util.*;
public class ArrayList21 {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(23);
          Number.add(32);
           Number.add(45);
            Number.add(63);
            Number.removeIf(n->(n%3==0));
            for(int i :Number){
                System.out.println(i);
            }

    }
}
