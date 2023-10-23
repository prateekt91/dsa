package com.app.arrayOperations;

public class HighArray {

    private long[] arr;
    private int nElems;

    public HighArray() {
    }

    public HighArray(int max) {

        //Creates the array
        arr = new long[max];
        // no items yet !
        nElems = 0;
    }

    public boolean find(long searchKey) {

        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] == searchKey) {
                System.out.println("Element found at location :" + j);
                break;
            }
        }

        return j != nElems;
    }

    public void insert(long value) {

        arr[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {

        int j;
        //look for the elem we have to delete
        for (j = 0; j < nElems; j++) {
            if (value == arr[j]) {
                break;
            }
        }

        if (nElems == j) {
            //elem not found
            return false;
        } else {
            //move higher elem down to empty space
            for (int k = j; k < nElems; k++) {
                arr[k] = arr[k + 1];
            }
            // decrement size of array
            nElems--;
            return true;
        }
    }

    public void display() {

        for(int i=0; i<nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
