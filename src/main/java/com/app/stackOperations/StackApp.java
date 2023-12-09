package com.app.stackOperations;

public class StackApp {

    public static void main(String[] args) {

        StackX myStack = new StackX(10);

        myStack.push(10);
        myStack.push(30);
        myStack.push(60);
        myStack.push(100);


        while(!myStack.isEmpty()) {
            long value = myStack.pop();
            System.out.println(value);
            System.out.println();
        }
        System.out.println();
    }

}
