package com.app.com.app.stackOperations;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("############################String Reverser#####################################");
        System.out.println("Enter String to reverse :");
        String input = in.next();
        int stackSize = input.length();
       StringX stringX = new StringX(stackSize);

        for(char ch: input.toCharArray()) {
            stringX.push(ch);
        }

        String output = "";
        while (!stringX.isEmpty()) {
            output += stringX.pop();
        }

        System.out.println(output);
    }
}
