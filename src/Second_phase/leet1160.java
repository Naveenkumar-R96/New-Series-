package Second_phase;

import java.util.HashSet;

public class leet1160 {
    public static void main(String[] args) {
        String[] words = {"apple","pear"};
        String chars = "aple";

        HashSet<Character> set=new HashSet<>();

        for(char val:chars.toCharArray()){
            set.add(val);
        }

        int total=0;

        for (int i = 0; i < words.length; i++) {
            String value=words[i];
            boolean check=true;
            for (int j = 0; j <value.length(); j++) {
                if(!set.contains(value.charAt(j))){
                    check=false;
                    break;
                }
            }
            int leng=value.length();
            if (check){
                total=total+leng;
            }
        }
        System.out.println(total);
    }
}
