package practicing.one;

import java.util.Arrays;

public class leet28 {
    public static void main(String[] args) {
        String s="abaaba";
        System.out.println(validPalindrome(s));
    }
    static boolean validPalindrome(String s){

        StringBuilder nw=new StringBuilder(s);
        System.out.println(nw);
        nw.deleteCharAt(0);
        System.out.println(nw);
        int left=0;
        int right=s.length()-1;
        System.out.println(left);
        System.out.println(right);

        while(left<right){

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }

        return true;
    }
}
