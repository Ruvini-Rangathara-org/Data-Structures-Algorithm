package org.example.queue;

import org.example.queue.Queue;

/**
 * Description:
 * Author: ruu
 * Created: 2023-11-22 12.40
 */
public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(6);

        System.out.println();

        if(queue.isFull()) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue is not full");
        }

        int size = queue.size();
        System.out.println("Size: " + size);

        int data = queue.deQueue();
        System.out.println("Dequeued: " + data);

        if(queue.isFull()) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue is not full");
        }

        size = queue.size();
        System.out.println("Size: " + size);

        queue.printQueue();

        int peek = queue.peek();
        if (peek != -1) {
            System.out.println("Peek: " + peek);
        }

        queue.growQueue();



    }
}
