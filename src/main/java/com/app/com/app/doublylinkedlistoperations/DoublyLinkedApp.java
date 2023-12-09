package com.app.com.app.doublylinkedlistoperations;

public class DoublyLinkedApp {

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.insertFirst(22);
        linkedList.insertFirst(44);
        linkedList.insertFirst(66);

        linkedList.insertLast(11);
        linkedList.insertLast(33);
        linkedList.insertLast(55);

        linkedList.displayForward();
        linkedList.displayBackward();

        //deleting the list
        linkedList.deleteFirst();
        linkedList.displayForward();
        linkedList.deleteLast();
        linkedList.displayForward();
        System.out.print("Deleting 22 ");
        linkedList.deleteKey(22);

        linkedList.displayForward();

        linkedList.insertAfter(44, 77);
        linkedList.insertAfter(33, 88);

        linkedList.displayForward();
    }
}
