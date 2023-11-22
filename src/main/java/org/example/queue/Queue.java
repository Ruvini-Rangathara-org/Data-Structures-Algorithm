package org.example.queue;

/**
 * Description:
 * Author: ruu
 * Created: 2023-11-22 12.40
 */
public class Queue {
    private int[] queue;
    private int front; //head
    private int rear; //tail

    public Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
            System.out.println(data + " added to the queue");
        }
    }

    public boolean isFull(){
        return rear == queue.length - 1;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front++];
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+"  ");
            }
            System.out.println();
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queue[front];
        }
    }

    public int size() {
        return rear - front + 1;
    }

    public void growQueue() {
        int[] newQueue = new int[queue.length * 2];
        System.arraycopy(queue, 0, newQueue, 0, queue.length);
        queue = newQueue;
        System.out.println("Queue size is doubled, new size is : "+queue.length);
    }

}
