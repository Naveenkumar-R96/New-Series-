package practicing.one;

import java.util.Arrays;

public class leet2105 {
    public static void main(String[] args) {
        int[] arr={2,2,3,3};
        int a=5;int b=5;
        int[] ar={a};
        System.out.println(Arrays.toString(ar));
        int left = 0;
        int right = arr.length - 1;
        int count=0;
        while (left < right) {

            if (arr[left] <= a && arr[right] <= b) {
                a = a - arr[left];
                left++;
                b = b - arr[right];
                right--;
            } else if (arr[left] <=a ) {
                a = a - arr[left];
                left++;
            } else if (arr[right] <= b) {
                b = b - arr[right];
                right--;
            } else if (arr[left]>a) {
                a=ar[0];
                a = a - arr[left];
                left++;
                count++;
            } else if (arr[right]>b) {
                b=ar[0];
                b = b - arr[right];
                right--;
                count++;
            }
        }
        System.out.println(count);

    }
}
