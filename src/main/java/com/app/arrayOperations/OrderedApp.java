package com.app.arrayOperations;

import java.util.Scanner;

public class OrderedApp {

    public static void main(String[] args) {

        int maxSize = 100;
        OrderedArray arr = new OrderedArray(maxSize);

        boolean flag = true;    //control the flow of App

        //Inserting array elements from User
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.insert(in.nextLong());
        }

        while (flag) {
            arr.display();

            System.out.println("Enter element which you want to search :");
            int searchKey = in.nextInt();

            //searching for item
            if (arr.find(searchKey) != arr.size()) {
                System.out.println("Found :" + searchKey);
            } else {
                System.out.println("Can't Find :" + searchKey);
            }

            System.out.println("Enter element to delete");
            int delElem = in.nextInt();

            arr.delete(delElem);

            System.out.println("Array after deletion :");
            arr.display();

            System.out.println("Do you want to try operation again? (Y/N):");
            String choice = in.next();
            if (choice.equalsIgnoreCase("Y")) {
                continue;
            }
            flag = false;
        }
    }
}
