package practicing.one;

import java.util.Arrays;

public class leet2574 {
    public static void main(String[] args) {
        int[] nums={0, 0, 5, 0};
        int[] rightSum=new int [nums.length];
        int[] leftSum=new int[nums.length];
        int[] ans=new int[nums.length];
        int n=nums.length;

        rightSum[0]=0;


        for(int i=1;i<n;i++){
            rightSum[i]=nums[i-1]+rightSum[i-1];
        }
        leftSum[n-1]=0;

        for(int i=n-2;i>=0;i--){
            leftSum[i]=nums[i+1]+leftSum[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=leftSum[i]-rightSum[i];
            if(ans[i]<0){
                ans[i]=ans[i]*-1;
            }
        }

        System.out.println(Arrays.toString(ans));

    }
}
