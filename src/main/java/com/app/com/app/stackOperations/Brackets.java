package com.app.com.app.stackOperations;

public class Brackets {

    public int maxSize;
    public char[] stackArray;
    public int top;

    public Brackets(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch) {
        stackArray[++top] = ch;
    }

    public char pop() {
        return stackArray[top --];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
