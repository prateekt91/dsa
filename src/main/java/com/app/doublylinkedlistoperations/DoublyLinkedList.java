package com.app.doublylinkedlistoperations;


public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long data) {
        Link newLink = new Link(data);

        if(isEmpty()) {             //if Empty List
            last = newLink;         // newLink <-- Last
        } else {
            first.previous = newLink;       //newLink <-- oldFirst
        }
        newLink.next = first;               //newLink --> oldFirst
        first = newLink;                    //first --> newLink
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);

        if (isEmpty()) {                //if Empty List
            first = newLink;            //first --> newLink
        } else {
            last.next = newLink;        //old last --> newLink
            newLink.previous = last;    //old last <-- newLink
        }
        last = newLink;                 //newLink <-- last
    }

    public Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {       //if only one item
            last = null;                //null <-- last
        } else {
            first.next.previous = null;     //null <-- old next
        }
        first = first.next;                 //first --> old next
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if(first.next == null) {        //if only one item
            first = null;               //first --> null
        } else {
            last.previous.next =null;       //old prev --> null
        }
        last = last.previous;               // old prev <-- last
        return temp;
    }

    public boolean insertAfter(long key, long data) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null){
                return false;
            }
        }
        Link newLink = new Link(data);
        if (current == last){
            newLink.next = null;
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(long key) {
        Link current = first;
        while (current.dData != key){
            current = current.next;
            if (current == null){
                return null;
            }
        }
        if (current == first){
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last){
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.print("List {first-->last}: ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.print("");
    }

    public void displayBackward() {
        System.out.print("List {last-->first}: ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.print("");
    }

}
