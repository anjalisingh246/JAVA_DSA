package stackquestions;

class S2{
    private Node top;
    private int size;
    S2(){
        this.top=null;
        this.size=0;
    }
    class Node{
        int value;
        Node next;
        public Node(int value){
       this.value=value;
        }
    }
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;
        size++;
    }
    public int pop(){
if(isEmpty()){
       System.out.println("Stack underFlow,empty "); 
             return -1;
}
int value = top.value;
top=top.next;
size--;
return value;
    }
    public int peek(){
        if(isEmpty()){
       System.out.println("Stack underFlow,empty "); 
             return -1;
        }
        return top.value;
    }
    public int size(){
        return size;
    }
    public void display(){
         if(isEmpty()){
             System.out.println("Stack is empty "); 
             return;
         }
       Node temp = top;
         System.out.println("stack top to bottom:");
  while(temp!=null){
    System.out.println(temp.value+" ");
    temp = temp.next;
  }
  System.out.println("");
    }
    public boolean isEmpty(){
        return top == null;
    }
}

public class stack2 {
    public static void main(String[] args) {
        S2 obj=new S2();
        obj.push(12);
         obj.push(173);
         obj.push(143);
         obj.push(213);
         obj.push(133);
         System.out.println( obj.pop());
        obj.display();
         obj.size();
         obj.display();
    }
}
