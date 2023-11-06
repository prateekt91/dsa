package com.app.com.app.stackOperations;

import java.util.Scanner;

public class BracketMatcher {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter statement to match :");
        String input = in.next();

        check(input);

    }

    public static void check(String input){

        Brackets brackets = new Brackets(input.length());

        for(int i = 0; i < input.length(); i++ ) {
            char ch = input.charAt(i);
            switch (ch) {

                case '{','[','(' -> brackets.push(ch);
                case '}',']',')' -> {
                    if(!brackets.isEmpty()) {
                        char chx = brackets.pop();
                        if((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                            System.out.println("Error: "+ch+" at " + i);
                        }
                    }
                    else System.out.println("Error: "+ch+" at " + i);
                }

            }
        }

        if(!brackets.isEmpty())
            System.out.println("Error : missing right delimiter");
    }
}
