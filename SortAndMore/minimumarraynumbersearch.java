package com.company.sdacademy.SortAndMore;

public class minimumarraynumbersearch {
    public static void main(String args[]) {
        // initializing an array
        int arr[] = {2, 5, 77, 100003, 564, -5, -9999999};

        // calling the min function
        System.out.println(min(arr));
    }

    // algorithm for finding a minimum in array
    static int min(int[] arr){
        int min = arr[0];

        // iterating through all the elements in the array
        for(int i = 1; i < arr.length; i++){
            // if the currently presumed minimum
            // is bigger than the currently checked number
            // we know that we need to change the minimum
            // for that number
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}