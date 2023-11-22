package org.example.linkedlist;

/**
 * Author: ruu
 * Created: 2023-11-22 14.07
 */

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        if(linkedList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(4);
        linkedList.insertAtBeginning(5);

//        linkedList.insertAtEnd(6);
//        linkedList.insertAtEnd(7);
//        linkedList.insertAtEnd(8);
//
//        linkedList.printList();
//        System.out.println("Size : "+linkedList.size());
//
//        linkedList.deleteFromBegin();
//
//        linkedList.printList();
//        System.out.println("Size : "+linkedList.size());
//
//        linkedList.deleteFromEnd();
//
//        linkedList.printList();
//        System.out.println("Size : "+linkedList.size());

        linkedList.printList();


//        int size = linkedList.size();
//        System.out.println("Size : "+size);
//
////        linkedList.insertSpecificPosition(100, 0);
////        linkedList.printList();
//
//        linkedList.deleteBySpecificPosition(0);
//        linkedList.printList();
//
//        size = linkedList.size();
//        System.out.println("Size : "+size);

        int data = linkedList.get(4);
        System.out.println("Data at 2nd position is : "+data);

    }
}
