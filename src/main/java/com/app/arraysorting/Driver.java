package com.app.arraysorting;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        Sorting sorting = new Sorting();

        int[] testArray = {23,67,78,43,22,11,9,0,54};

        System.out.println("Array before sorting :");

        Arrays.stream(testArray).forEach(System.out::println);
       // Stream.of(testArray).forEach(System.out::println);

   //     testArray = sorting.bubbleSort(testArray);
        testArray = sorting.insertionSort(testArray);
        System.out.println("Array after soring :");

        Arrays.stream(testArray).forEach(System.out::println);
    }
}
