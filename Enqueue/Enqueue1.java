package Enqueue;
class ArrayQueue{
     private int[] Arr;
    private int capacity;
    private int rear;
    private int front;
    ArrayQueue(int size){
         Arr =new int[size];
         capacity=size;
         front=0;
         rear=-1;
         
    }
    public boolean isFull(){
        return rear ==capacity-1;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void Enqueue(int value){
        if(isFull()){
             System.out.println("Cannot Enqueue: "+value);
             return;
        }
        Arr[++rear]=value;
    }
    public int dequeue(){
        if(isEmpty()){
             System.out.println("queue is Empty");
             return -1;
        }
        int value =Arr[front++];
        if(front>rear){
            front=0;
            rear=-1;
        }
        return value;
    }
    public void display(){
        if(isEmpty()){
             System.out.println("queue is Empty");
             return;
        }
        System.out.print("QUEUE : ");
        for(int i=front;i<=rear;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}

public class Enqueue1 {
	public static void main(String[] args) {
	   ArrayQueue queue =new ArrayQueue(5);
	   queue.Enqueue(10);
	   queue.Enqueue(11);
	   queue.Enqueue(1);
	   queue.Enqueue(12);
	   queue.Enqueue(16);
	   queue.Enqueue(14);
	   queue.display();
	 queue.dequeue();
	    queue.display();
	}
}

