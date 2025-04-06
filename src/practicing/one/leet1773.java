package practicing.one;

import java.util.Arrays;

public class leet1773 {
    public static void main(String[] args) {
        String[][] arr = {{"phone","blue","pixel"}, {"computer","silver","phone"}, {"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
      //  System.out.println(func(arr, ruleKey, ruleValue));
        String s="is2 sentence4 This1 a3";
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
    }

    static int func(String[][] items, String rulekey, String rulevalue) {
        int val;
        if (rulekey == "color") {
            val = 1;
        } else if (rulekey == "type") {
            val = 0;
        } else {
            val = 2;
        }
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i][val]==rulevalue){
                count++;
            }
        }
        return count;
    }
}
