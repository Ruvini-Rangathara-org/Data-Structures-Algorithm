package org.example.linkedlist;

/**
 * Description:
 * Author: ruu
 * Created: 2023-11-22 14.02
 */
public class LinkedList {

    private Node head; // default value is null

    private static class Node{
        private int data;
        private Node next; // next node object

        public Node(int data){
            this.data = data;
            this.next = null;
        }


    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void printList(){
        System.out.print("List: ");
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFromBegin(){
        if(head == null){
            System.out.println("List is empty");
        }
        head = head.next;
    }

    public void deleteFromEnd(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node current = head;
        Node previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public int size(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

}
