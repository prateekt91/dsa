package com.app.com.app.stackOperations;

public class StackX {

    private int maxSize;        //size of stack
    private long[] stackArray;
    private int top;            //top of stack

    public StackX(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;          //Empty stack
    }

    public void push(long item) {
        stackArray[++top] = item;   //increment top and insert item
    }

    public long pop() {
        return stackArray[top--];   //get the item and decrement top
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }
}
