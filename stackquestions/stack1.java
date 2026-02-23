package stackquestions;

 class Stack {
  
      int[] arr ;
      int capacity;
      int top;
     public Stack(int size){
          arr =new int[size];
          capacity =size;
          top =-1;
     }
     public void push(int value){
         if(isFull()){
             System.out.println("Stack overFlow , Cannot push: "+value);
             return;
         }
         arr[++top]=value;
     }
     public int pop(){
         if(isEmpty()){
             System.out.println("Stack underFlow,empty "); 
             return -1;
         }
         return arr[top--];
     }
     public int peek(){
         if(isEmpty()){
             System.out.println("Stack underFlow,empty "); 
             return -1;
         }
         return arr[top];
     }
     public void display(){
         if(isEmpty()){
             System.out.println("Stack is empty "); 
             return;
         }
         for(int i=0;i<=top;i++){
             System.out.println(arr[i]+" ");
         }
         System.out.println("top");
     }
     public boolean isEmpty(){
         return top==-1;
     }
     public boolean isFull(){
         return top==capacity-1;
     }
     
}
public class stack1
{
	public static void main(String[] args) {
	   Stack st =new Stack(5); 
	   st.push(1);
	   st.push(2);
	   st.push(3);
	   st.push(4);
	   st.push(5);
	   st.push(6);
	   System.out.println(st.pop());
	   System.out.println(st.pop());
	   System.out.println(st.pop());
	   System.out.println(st.pop());
	   System.out.println(st.pop());
	   System.out.println(st.isEmpty());
	   st.display();
	}
}

