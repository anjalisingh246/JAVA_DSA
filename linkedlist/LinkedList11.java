//print single linked list
package linkedlist;
class ll{
      
      private Node head;
      private Node tail;
      private int size;
    
      public ll(){
           this.size=0;
           this.head=null;
           this.tail=null;
      }
         public void insertFirst(int value){
            Node newNode = new Node(value);
                newNode.next =head;
                head =newNode;
                if(tail==null){
                    tail=head;
                }
                size++;
         }
         public void insertLast(int value){
              if(head==null){
                   insertFirst(value);
                   return;
              }
              Node newNode =new Node(value);
               tail.next=newNode;
               tail=newNode;
               size++;
         }
         public void insert(int value, int index){
                 if(index==0){
                   insertFirst(value);  
                   return;
                 }
                 if(index==size-1){
                     insertLast(value);
                 }
                 Node temp =head;
                 for(int i=1;i<index;i++){
                       temp=temp.next;
                 }
                 Node newNode =new Node(value);
                 newNode.next=temp.next;
                 temp.next=newNode;
                 size++;
         }
         public void deletefirst(){
          if (head == null){
          System.out.println("Linkedlist is empty"); 
          return;
          }
          head = head.next;
System.out.println();

         }
         public void display(){
                Node temp =head;
                while(temp !=null){
                    System.out.print(temp.value +" ->"); 
                    temp=temp.next;
                } 
                System.out.print("END");
         }
    private class Node{
          private int value;
          private Node next;
         public Node(int value){
               this.value=value;
         }
         public Node(int value,Node next){
              this.value=value;
              this.next=next;
         }
        
    }
}
public class LinkedList11
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ll list =new ll();
		list.insertFirst(10);
		list.insertFirst(12);
		list.insertFirst(13);
		list.insertLast(3);
		list.insertLast(9);
		list.insert(5,3);
		list.display();
          list.deletefirst();
          list.display();
	}
}