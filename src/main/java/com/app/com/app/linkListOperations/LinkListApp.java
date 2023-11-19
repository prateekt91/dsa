package com.app.com.app.linkListOperations;

public class LinkListApp {

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(20, 2.99);
        linkList.insertFirst(40, 3.99);
        linkList.insertFirst(60, 4.99);
        linkList.insertFirst(80, 5.99);

        linkList.displayList();

        while (!linkList.isEmpty()) {
            Link aLink = linkList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println();
        }
        linkList.displayList();
    }
}
