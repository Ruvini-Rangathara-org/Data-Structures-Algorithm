package org.example;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

//        stack.pop();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);


        stack.printStack();

        int peek = stack.peek();
        System.out.println("\nPeek: " + peek);

        stack.push(20);
        peek = stack.peek();
        System.out.println("\nPeek: " + peek);


        stack.pop();
        if (stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }


        stack.push(10);

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }

        if (stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }

        int size = stack.size();
        System.out.println("Size: " + size);

        stack.growStack();

    }
}
