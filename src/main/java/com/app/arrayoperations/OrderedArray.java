package com.app.arrayoperations;

public class OrderedArray {

    private long [] arr;
    private int nElems;

    public OrderedArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    //Binary Search Implementation
    public int find(long searchKey) {

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {

            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;              // cant find the elem
            else {
                if (arr[curIn] < searchKey)
                    lowerBound = curIn + 1;     //Elem is in upper half
                else
                    upperBound = curIn - 1;      //Elem is in lower half
            }
        }
    }

    public void insert(long value) {
        int j;
        for(j = 0; j<nElems; j++)       // Find where we need to insert
            if(arr[j] > value)
                break;
        for(int k=nElems; k>j; k--)     //move bigger one up
            arr[k] = arr[k-1];
        arr[j] = value;                 //insert it
        nElems ++;                      //increment size
    }

    public boolean delete(long value) {

        int j = find(value);            // Using Binary Search
        if(j == nElems)
            return false;
        else {
            for(int k=j; k<nElems; k++) {
                arr[k] = arr[k+1];
            }
            nElems --;
            return true;
        }
    }

    public void display() {
        for (int i=0; i<nElems; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

}


