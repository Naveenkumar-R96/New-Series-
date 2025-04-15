package practicing.one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leet557 {
    public static void main(String[] args) {
        String word="Naveen kumar the Don";
        System.out.println(reverseWords(word));
    }
    public static String reverseWords(String s) {

        String arr[]=s.split(" ");
        StringBuilder word=new StringBuilder();

        for (int i = 0; i < arr.length ; i++) {
            StringBuilder reverse=new StringBuilder(arr[i]);
            word.append(reverse.reverse()).append(" ");


        }


        return word.toString().trim();
    }
}
