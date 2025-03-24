package First_phase.Sorting.bubbleSort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={-232,343,-2,54,0,23,-23};
        bubblee(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*static void bubblee(int[] arr) {
        //boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            *//*swapped = false;*//*
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    //swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            *//*if (!swapped) { // !false = true
                break;
            }*//*
        }*/
        static void bubblee(int[] arr){
            for(int i=0;i< arr.length;i++){
                for(int j=1;j<arr.length-i;j++){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
        }
    }

