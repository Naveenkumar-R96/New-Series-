package First_phase.Basics;

import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
    /*   //swaping

        int[] value={1,2,3,4,5};
        func(value,1,2);
    }
    public static void func(int[] value,int one, int two){
        int temp=value[one];
        value[one]=value[two];
        value[two]=temp;
        System.out.println(
                Arrays.toString(value)
        );*/


        int[] arr={1,23,3434,22,54,23};
        swap(arr);
    }
    public static void swap(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            int value=arr[i];
            if(value>max){
                max=value;
            }
        }
        System.out.println(max);
    }
}
