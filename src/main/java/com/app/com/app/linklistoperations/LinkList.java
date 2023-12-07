package com.app.com.app.linklistoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkList {

    private Link first;

    private Logger log = LoggerFactory.getLogger(LinkList.class);

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        log.info("List (first --> last) :");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        log.info(" ");
    }
}
