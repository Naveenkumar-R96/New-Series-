package First_phase.Sorting.insertion;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

class insertionsort {
    public static void main(String[] args) {
        int[] arr={5,0,4,2,1,};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insert (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}