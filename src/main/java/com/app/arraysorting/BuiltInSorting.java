package com.app.arraysorting;

import java.util.*;

public class BuiltInSorting {

    public static void main(String[] args) {

        final List<Integer> numbers = Arrays.asList(4,7,1,6,4,3,5);

        //Natural ordering
        //Collections.sort(numbers);
        //Custom ordering
        numbers.sort(new DescendingOrder());
        System.out.println(numbers);
    }

}
