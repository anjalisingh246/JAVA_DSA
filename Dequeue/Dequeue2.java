package Dequeue;
class CircularDeque {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    public CircularDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size=0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Cannot insert at front");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front= (front-1 +capacity)%capacity;
        }
        arr[front] = value;
        System.out.println("Inserted at front: " + value);
        size++;
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Cannot insert at rear. Deque is full.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear=(rear+1)%capacity;
        }
        arr[rear] = value;
        System.out.println("Inserted at rear: " + value);
        size++;
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.println("Deleted from front: " + arr[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front=(front+1)%capacity;
        }
        size--;
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.println("Deleted from rear: " + arr[rear]);

        if (front == rear) {
            front = rear = -1;
        } else {
            rear=(rear -1 + capacity)%capacity;
        }
        size--;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.print("Deque: ");
        for (int i = 0; i < size; i++) {
              int index=(front +i)%capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
}
public class Dequeue2 {
    public static void main(String[] args) {
        CircularDeque dq = new CircularDeque(5);
         dq.insertFront(5);
        dq.insertRear(10);
         dq.insertRear(20);
        
         dq.insertFront(2); 
        // dq.display();

         dq.deleteFront();
         dq.deleteRear();
        // dq.display();

        dq.insertFront(30);
        dq.insertRear(40);
        dq.insertRear(50);
         dq.insertRear(60);
        dq.display();
    }
}