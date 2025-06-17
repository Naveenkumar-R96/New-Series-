package practicing.one;

import java.util.Arrays;

public class leet345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        char[] arr=s.toCharArray();

        char[] value=arrr(arr);
        String ans=new String(value);
        System.out.println(ans);



    }
    public static char[] arrr(char[] arr){
        int left=0;
        int right=arr.length-1;
        String vow="aeiouAEIOU";

        while (left < right) {
            if (vow.indexOf(arr[left]) < 0) {
                left++;
            } else if (vow.indexOf(arr[right]) < 0) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;


    }
}
