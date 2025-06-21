package practicing.one;

import java.util.Arrays;

public class leet151 {
    public static void main(String[] args) {
       String s = "the sky  is   blue   ";
        System.out.println(s);
       String cleaned= s.trim().replaceAll("\\s+", " ");
        System.out.println(cleaned);
        String[] word=cleaned.split(" ");
        System.out.println(Arrays.toString(word));

        int left=0;
        int right=word.length-1;

        while (left<right){
            String temp =word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(word));

        String ans=String.join(" ",word);
        System.out.println(ans);

    }
}
