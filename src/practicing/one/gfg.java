package practicing.one;

import java.util.ArrayList;
import java.util.Arrays;

public class gfg {

    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();
        int n=4;
        for (int i = 1; i <=14 ; i++) {
            for (int j = 1; j <=i; j++) {
                val.add(j);
            }
        }
        System.out.println(val.get(n-1));
    }
}
