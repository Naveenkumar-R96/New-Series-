package practicing.one;

import java.util.Arrays;
import java.util.Collections;

public class leet414 {
    public static void main(String[] args) {
        Integer[] arr = {5,6,7,8};

        Arrays.sort(arr, Collections.reverseOrder()); // Sorting in descending order

        System.out.println(Arrays.toString(arr));

        int len=arr.length;

        if (len == 3 || len < 3) {
            System.out.println(arr[len - 1]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i =len-1; i >=0; i--) {
            System.out.println(i);
        }
    }


}
