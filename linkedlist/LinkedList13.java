//circular linkedlist from single linkedlist
package linkedlist;
class ll2{ 
      private Node head;
      private Node tail;
      private int size;
    
      public ll2(){
           this.size=0;
           this.head=null;
           this.tail=null;
      }
         public void insertFirst(int value){
             
            Node newNode = new Node(value);
                if(head==null){
                   head= newNode;
                    tail=newNode;
                    tail.next=head;
                }else{
                newNode.next =head;
                head =newNode;
                tail.next=newNode;
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
              tail.next=head;
              size++;
         }
         public void insert(int value, int index){
                 if(index==0){
                  insertFirst(value);  
                  return;
                 }
                 if(index==size){
                     insertLast(value);
                     return;
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
          public int delete(int index){
              Node prev =get(index-1);
                int val= prev.next.value;
                 prev.next =prev.next.next;
                 size--;
                return val;
               
          }
          public int deleteFirst(){
              if(head==null){
                      tail=null;
                 }
              int value= head.value;
              head=head.next;
                 tail.next=head;
                 size--;
              return value;
              
          }
          public int deleteLast(){
              if(size<=1){
                 return deleteFirst();
                   
              }
              Node secendLast=get(size-2);
                
              int val =tail.value;
              tail=secendLast;
              tail.next=head;
              size--;
              return val;
          }
          
         public void display(){
                Node temp =head;
                for(int i=1;i<=size;i++){
                    
                    System.out.print(temp.value +" ->"); 
                    temp=temp.next;
                } 
                
                System.out.println("END");
         }
          public int search(int val){
              Node temp =head;
              int position=0;
              for(int i=0;i<size;i++){
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
public class LinkedList13
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ll2 list =new ll2();
		list.insertFirst(10);
		list.insertFirst(12);
		list.insertFirst(13);
		list.insertLast(3);
		list.insertLast(9);
		list.insert(5,2);
		list.display();
		list.insert(5,4);
		System.out.println(list.deleteFirst());
		list.display();
			System.out.println(list.deleteLast());
		list.display();
		 System.out.println(list.delete(2));
		 list.display();
		 System.out.println("value 5 is present at :"+list.search(5));
		 
	}
}