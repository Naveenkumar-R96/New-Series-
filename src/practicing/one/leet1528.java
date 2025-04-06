package practicing.one;

import java.util.ArrayList;
import java.util.Arrays;

public class leet1528 {
    public static void main(String[] args) {
        int[] val={};
        int[] arr= new int[val.length];
        String strVal="";
        for (int i = 0; i < val.length; i++) {
            int crtPos=val[i];
            arr[crtPos]= strVal.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

        StringBuilder strVa=new StringBuilder(val.length);
        for (int i = 0; i < val.length; i++) {
            strVa.append((char) arr[i]);
        }
        System.out.println(strVa);
    }
}