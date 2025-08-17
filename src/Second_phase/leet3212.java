package Second_phase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class leet3212 {
    public static void main(String[] args) {
        String  word = "AbBCab";
        int[] val=new int[word.length()];
        for(int i=0;i<word.length();i++){
            val[i]=(char)(word.charAt(i));
        }
        System.out.println(Arrays.toString(val));
        HashSet<Character> set=new HashSet<>();

        for(char num:word.toCharArray()){
            set.add(num);
        }
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:set){
            map.put(ch,(ch+0));
        }
        System.out.println(map);

        int count=0;

        for(Character key: map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
            if(map.containsValue(key-32)){
                count++;
            }
        }
        System.out.println(count);
    }

}
