package practicing.three;

import java.util.Arrays;

public class leet2559 {
    public static void main(String[] args) {
        String[] words={"a","e","i"};
        int[][] queries={{0, 1}, {1, 2}};
        int n=words.length;
        int[] ans=new int[queries.length];

        int[] sum=new int[n];
        int count=0;

        for (int i = 0; i <n ; i++) {
            char[] arr=words[i].toCharArray();
            if(check(arr)){
                count++;
                sum[i]=count;
            }
        }

        for (int i = 0; i <queries.length ; i++) {
            int left=queries[i][0];
            int right=queries[i][1];

            if(left==0){
             ans[i]=sum[right];
            }
            else{
                ans[i]=sum[right] - sum[left - 1];
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(ans));
    }

    public static boolean check(char[] arr){
        int n=arr.length-1;
        String vow="aeiouAEIOU";
        if(vow.indexOf(arr[0]) !=-1 && vow.indexOf(arr[n]) !=-1){
            return true;
        }
        return false;
    }
}
