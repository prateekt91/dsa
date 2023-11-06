package com.app.arraySorting;
public class Sorting {

    public int[] bubbleSort(int[] numbers) {

        //Using while loop

//        boolean isNumberSwitched;
//
//        do {
//            isNumberSwitched = false;
//            for(int i = 0; i < numbers.length - 1; i++) {
//                if(numbers[i+1] < numbers[i]) {
//                    int temp = numbers[i+1];
//                    numbers[i+1] = numbers[i];
//                    numbers[i] = temp;
//                    isNumberSwitched = true;
//                }
//            }
//        } while (isNumberSwitched);
//        return numbers;

        //Using for loop
        int out, in, temp;
        for(out = numbers.length -1; out>1; out--) {
            for (in = 0; in<out ; in++) {
                if(numbers[in] > numbers[in + 1]) {
                    temp = numbers[in];
                    numbers[in] = numbers[in + 1];
                    numbers[in + 1] = temp;
                }
            }
        }
        return numbers;
    }

    public int[] insertionSort(int[] numbers) {

        int in, out;
        for(out = 1; out < numbers.length; out++) {
            int temp = numbers[out];
            in = out;
            while( in > 0 && numbers[in-1] >= temp) {
                numbers[in] = numbers[in-1];
                --in;
            }
            numbers[in] = temp;
        }
        return numbers;
    }
}
