package stackquestions;
import java.util.*;
public class stack3{
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        stack1.push("Ayush");
        stack1.push("Ashish");
        stack1.push("Garima");
        stack1.pop();
        stack1.remove(0);
        Iterator<String> itr = stack1.iterator();
        while(itr.hasNext());
        System.out.println(itr.next());
    }
}
