package DoubleEndedQueue;
import java.util.*;

public class CircularDequeue {
    int capacity = 5;
    int front = -1;
    int rear = -1;
    int size = 0;
    String arr[] = new String[capacity];

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    // Add at front
    void addFirst(String data) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = data;
        size++;
    }

    // Add at rear
    void addLast(String data) {
        if (isFull()) {
            System.out.println("OverFlow");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = data;
        size++;
    }

    // Remove from front
    String pollFirst() {
        if (isEmpty()) {
            return null;
        }
        String data = arr[front];
        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return data;
    }

    // Remove from rear
    String pollLast() {
        if (isEmpty()) {
            return null;
        }
        String data = arr[rear];
        if (front == rear) { // Only one element
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
        return data;
    }

    // Display deque
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDequeue dq = new CircularDequeue();
        
        dq.addLast("A");
        dq.addLast("B");
        dq.addFirst("C");
        dq.addFirst("D");
        dq.display();

        System.out.println("Removed from front: " + dq.pollFirst());
        dq.display();

        System.out.println("Removed from rear: " + dq.pollLast());
        dq.display();
    }
}
