package First_phase.searching.linearSearching;

import java.util.Arrays;

public class twoDarrray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6,},{7,8,9}};
        int target=7;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; i++){
                if(arr[i][j]==val){
                    return new int[]{i,j};
                }
            }

        }

        return new int[9];
    }

}
