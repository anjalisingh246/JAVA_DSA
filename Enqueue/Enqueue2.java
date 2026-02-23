package Enqueue;
class ArrayQueue{
     private int[] Arr;
    private int capacity;
    private int rear;
    private int front;
    private int size;
    ArrayQueue(int capacity){
         Arr =new int[capacity];
         size=0;
         this.capacity=capacity;
         front=0;
         rear=-1;
         
    }
    public boolean isFull(){
        return size ==capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void Enqueue(int value){
        if(isFull()){
             System.out.println("Cannot Enqueue: "+value);
             return;
        }
        rear=(rear+1)%capacity;
        Arr[rear]=value;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
             System.out.println("queue is Empty");
             return -1;
        }
        int value =Arr[front];
        front =(front+1)%capacity;
        size--;
        return value;
    }
    public void display(){
        if(isEmpty()){
             System.out.println("queue is Empty");
             return;
        }
        System.out.print("QUEUE : ");
        for(int i=0;i<size;i++){
            int index =(front+i)%capacity;
            System.out.print(Arr[index]+" ");
        }
        System.out.println();
    }
}

public class Enqueue2
{
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
	 queue.dequeue();
	  queue.Enqueue(14);
	    queue.display();
	}
}