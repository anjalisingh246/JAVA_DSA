package Dequeue;
class LinearDeque {
    private int[] arr;
    private int capacity;
    private int front;
    private int rear;

    public LinearDeque(int size) {
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    public void insertFront(int value) {
        if (front == 0) {
            System.out.println("Cannot insert at front. Reached beginning.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front--;
        }
        arr[front] = value;
        System.out.println("Inserted at front: " + value);
    }

    public void insertRear(int value) {
        if (rear == capacity - 1) {
            System.out.println("Cannot insert at rear. Deque is full.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
        System.out.println("Inserted at rear: " + value);
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
            front++;
        }
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
            rear--;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        System.out.print("Deque: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class  Dequeue{
    public static void main(String[] args) {
        LinearDeque dq = new LinearDeque(5);
        dq.insertFront(5);
        dq.insertRear(10);
        dq.insertRear(20);
        
        dq.insertFront(2); 
        dq.display();

        dq.deleteFront();
        dq.deleteRear();
        dq.display();

        dq.insertRear(30);
        dq.insertRear(40);
        dq.insertRear(50);
        dq.insertRear(60);
        dq.display();
    }
}
