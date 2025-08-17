package Second_phase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class leet423 {
    public static void main(String[] args) {
        String  s = "owoztneoer";
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            boolean check=false;
            for (int j = 0; j <arr[i].length() ; j++) {
                char c = arr[i].charAt(j);
                if (s.indexOf(c) == -1) {  // if even one letter missing
                    check = false;
                    break;
                }
                else{
                    check=true;
                }
            }
            if(check){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
