// Double LinkedList
package linkedlist;
class ll1{
      
      private Node head;
      private Node tail;
      private int size;
    
      public ll1(){
           this.size=0;
           this.head=null;
           this.tail=null;
      }
         private class Node{
          private int value;
          private Node next;
          private Node prev;
         public Node(int value){
               this.value=value;
         }
         public Node(int value,Node next,Node prev){
              this.value=value;
              this.next=next;
              this.prev=prev;
         }
        
    }
         public void insertFirst(int value){
            Node newNode = new Node(value);
                 if(head !=null){
                     head.prev=newNode;
                 }
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
              newNode.prev=tail;
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
                     return;
                 }
                 Node temp =head;
                 for(int i=1;i<index;i++){
                      temp=temp.next;
                 }
                 Node newNode =new Node(value);
                 newNode.next=temp.next;
                 newNode.prev=temp;
                 temp.next.prev=newNode;
                 temp.next=newNode;
                 size++;
         }
          public int delete(int index){
              Node temp =get(index-1);
                int val= temp.next.value;
                 temp.next =temp.next.next;
                 temp.next.prev=temp;
                 size--;
                return val;
               
          }
          public int deleteFirst(){
              int value= head.value;
              
              head=head.next;
              head.prev=null;
                 if(head.next==null){
                      tail=null;
                      head=null;
                 }
                 size--;
              return value;
          }
          public int deleteLast(){
              if(size<=1){
                 return deleteFirst();
                   
              }
              Node secendLast=get(size-2);
                
              int val =tail.value;
              tail.prev=null;
              tail=secendLast;
              tail.next=null;
              size--;
              return val;
          }
          
         public void display(){
                Node temp =head;
                while(temp !=null){
                    System.out.print(temp.value +" ->"); 
                    temp=temp.next;
                } 
                System.out.println("END");
         }
        //  public void displayRev(){
        //         Node temp =tail;
        //         while(temp !=null){
        //             System.out.print(temp.value +" ->"); 
        //             temp=temp.prev;
        //         } 
        //         System.out.println("Start");
        //  }
          public int search(int val){
              Node temp =head;
              int position=0;
              while(temp !=null){
                  if(temp.value == val) {
                         
                      return position;
                     
                  }
                     position++;
                     temp=temp.next;
              }
              return 0;
          }
          public Node get(int index){
                Node temp =head;
                
                for(int i=0;i<index;i++ ){
                      temp=temp.next;
                }
                return temp;
          }
 
}
public class LinkedList12
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ll1 list =new ll1();
		list.insertFirst(10);
		list.insertFirst(12);
		list.insertFirst(13);
		list.insertLast(3);
		list.insertLast(9);
		list.insert(5,2);
	list.insert(5,4);	
		list.display();
		// list.displayRev();
		System.out.println(list.deleteFirst());
		list.display();
			System.out.println(list.deleteLast());
		list.display();
		 System.out.println(list.delete(2));
		 list.display();
		 System.out.println("value 5 is present at :"+list.search(5));
		 
	}
}