package practicing.three;

import java.util.ArrayList;

public class leet3 {
    public static void main(String[] args) {
        String s="pwwkew";
        int val=lengthOfLongestSubstring(s);
        System.out.println(val);


    }
    public static int lengthOfLongestSubstring(String s){
        ArrayList arr=new ArrayList();

        for (int i = 0; i < s.length() ; i++) {
            if(arr.indexOf(s.charAt(i))==-1){
                arr.add(s.charAt(i));
            }
            else break;

        }
        return arr.size();


    }

}
