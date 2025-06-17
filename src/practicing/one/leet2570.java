package practicing.one;

import java.util.ArrayList;
import java.util.Arrays;

public class leet2570 {
    public static void main(String[] args) {
        int[][] num1={{2,4},{3,6},{5,5}};
        int[][] num2={{1,3},{4,3}};

        ArrayList<int[]> ary=new ArrayList<>();

        int i=0,j=0;


        while(i<num1.length && j< num2.length){
            int id1=num1[i][0],val1=num1[j][1];
            int id2=num2[i][0],val2=num2[j][1];

            if(id1<id2){
                ary.add(new int[]{id1,val1});
                i++;
            } else if (id1>id2) {
                ary.add(new int[]{id2,val2});
                j++;
            }
            else{
                ary.add(new int[]{id1,val1+val2});
                i++;
                j++;
            }
        }
        System.out.println(i);
        System.out.println(j);

        int[][] result = new int[ary.size()][2];
        for (int k = 0; k < ary.size(); k++) {
            result[k] = ary.get(k);
        }

        System.out.println(Arrays.deepToString(result));


       }
}
