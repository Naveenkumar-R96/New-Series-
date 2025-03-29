package First_phase.Sorting.bubbleSort;

import java.util.Arrays;

class bubble{
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={32,45,2134,-45,-2453};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}