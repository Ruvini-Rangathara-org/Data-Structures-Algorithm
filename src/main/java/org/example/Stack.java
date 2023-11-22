package org.example;


import java.util.EmptyStackException;

public class Stack {

    private int[] elementData;
    private int top;

    public Stack(int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int value){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        elementData[++top] = value;
    }

    //print stack
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int i = 0; i <= top; i++){
            System.out.print(elementData[i] + " ");
        }
    }

    public int peek(){
        return elementData[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == elementData.length - 1;
    }


    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elementData[top--];
    }


    public int size(){
        return top + 1;
    }

}