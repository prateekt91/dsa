package com.app.com.app.doublylinkedlistoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Link {
    public long dData;
    public Link next;
    public Link previous;

    Logger log = LoggerFactory.getLogger(Link.class);
    public Link(long d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
