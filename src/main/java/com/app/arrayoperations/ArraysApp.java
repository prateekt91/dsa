package com.app.arrayoperations;

public class ArraysApp {

    public static void main(String[] args) {

        LowArray arr;
        arr = new LowArray(100);
        int nElem = 0;

        arr.setElem(0, 77);
        arr.setElem(1,99);
        arr.setElem(2, 56);
        arr.setElem(3 ,34);
        arr.setElem(4, 76);
        arr.setElem(5, 23);
        arr.setElem(6, 89);
        arr.setElem(7, 65);
        arr.setElem(8, 45);
        arr.setElem(9, 80);
        nElem = 10;
        for (int val = 0; val < nElem; val++) System.out.print(arr.getElem(val) + " ");

        //Find an item
        int searchKey = 80;
        int j;
        for(j=0; j< nElem; j++)
            if (arr.getElem(j) == searchKey)
                break;

        if(j == nElem)
            System.out.println("Cant find " + searchKey );
        else
            System.out.println("Found " + searchKey  + " At position " + j);


        //Deletion of an element
        searchKey = 56;
        for(j=0; j< nElem; j++)
            if(arr.getElem(j) == searchKey)
                break;
        for(int k=j; k < nElem-1; k++)
            arr.setElem(k,arr.getElem(k+1));
        nElem--;

        System.out.println("Deleted Element " + searchKey);
        for (int val = 0; val < nElem; val++) System.out.print(arr.getElem(val) + " ");

    }
}

class LowArray {

    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
        return a[index];
    }
}
