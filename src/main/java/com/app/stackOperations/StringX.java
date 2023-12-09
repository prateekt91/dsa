package com.app.stackOperations;

public class StringX {

    private int maxSize;        //size of stack
    private char[] stackArray;
    private int top;            //top of stack

    public StringX(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;          //Empty stack
    }

    public void push(char item) {
        stackArray[++top] = item;   //increment top and insert item
    }

    public char pop() {
        return stackArray[top--];   //get the item and decrement top
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize -1);
    }
}

