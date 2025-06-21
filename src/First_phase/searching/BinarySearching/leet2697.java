package First_phase.searching.BinarySearching;

import org.w3c.dom.ls.LSOutput;

public class leet2697 {
    public static void main(String[] args) {
         String s = "zxcvbnmasdfghjklqwertyuioppoiuytrewqlkjhgfdsmnbvcxz";
         StringBuilder se=new StringBuilder(s);

         int left=0;
         int right=s.length()-1;

         while(left<right){
             if(se.charAt(left)==se.charAt(right)){
                 left++;
                 right--;
             } else if (se.charAt(left)<se.charAt(right)) {
                 se.setCharAt(right,se.charAt(left));
                 left++;
                 right--;
             }
             else{
                 se.setCharAt(left,se.charAt(right));
                 left++;
                 right--;
             }
         }
        System.out.println(se.toString());
    }
}
