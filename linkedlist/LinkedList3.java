//check for palindrome
package linkedlist;
 import java.util.*;
  public class LinkedList3 {
   public static void main(String[] args) {
     LinkedList<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(15);
         ll.add(15);
          ll.add(131);
           ll.add(80);
             ll.add(90);
      System.out.println(ll);
       int sum=0;
       int rem;
       int i=0;
        int num=0;
        
      for( i=0;i<ll.size();i++){
     num=num+ll.get(i);
      
      }
      System.out.println(num);
        int n=num;
   while(n>0){
  

     rem =n%10;
     sum = sum*10+rem;
     n=n/10;
   }
   
   if(num==sum){
    System.out.println("number is palindrome:"+sum);
   }
   else{
    System.out.println("number is not palindrome");
   }
}
}