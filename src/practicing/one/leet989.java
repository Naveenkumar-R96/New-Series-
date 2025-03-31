package practicing.one;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class leet989 {
    public static void main(String[] args) {
        int arr[]={9};
        int k=34;
        System.out.println(Arrays.toString(func(arr,k)));
    }
    static int[] func (int[] arr, int k){
        ArrayList <Integer> old=new ArrayList<>();
        String val="";
        for (int i = 0; i < arr.length; i++) {
            val=val+arr[i];
        }
        int anss=Integer.parseInt(val);
        int ans=anss+1;
      //  System.out.println(ans);

        Integer nav=Integer.valueOf(ans);
        String fin=String.valueOf(nav);
        nav=nav+1;
       /* System.out.println(nav.getClass().getSimpleName());
        System.out.println(fin.getClass().getSimpleName());
        System.out.println(nav);*/
        for (int j=0;j<fin.length();j++){
            old.add(fin.charAt(j)-'0');
        }
        System.out.println(old);

        int[] newArrray= new int[old.size()];
        for (int i = 0; i < arr.length; i++) {
            newArrray[i]=old.get(i);
        }
        return newArrray;
    }
}
