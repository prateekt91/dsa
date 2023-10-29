package com.app.arraySorting;
public class Sorting {

    public int[] bubbleSort(int[] numbers) {

        boolean isNumberSwitched;

        do {
            isNumberSwitched = false;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i+1] < numbers[i]) {
                    int temp = numbers[i+1];
                    numbers[i+1] = numbers[i];
                    numbers[i] = temp;
                    isNumberSwitched = true;
                }
            }
        } while (isNumberSwitched);
        return numbers;
    }
}
