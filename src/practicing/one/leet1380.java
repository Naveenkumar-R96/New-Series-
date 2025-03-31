package practicing.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leet1380 {
    public static void main(String[] args) {
        int matrix[][] = {{3,6}, {7,1}, {5,2},{4,8}};
        System.out.println(func(matrix));
    }

    static int func(int[][] array) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            int min = array[i][0];
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            ans.add(min);

        }
        return Collections.max(ans);
    }

}
