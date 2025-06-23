package practicing.one;

import java.util.Arrays;

public class leet977 {
    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            if(left==right){
                nums[left]=nums[left]*nums[left];
                left++;
            }
            else{
                nums[left]=nums[left]*nums[left];
                nums[right]=nums[right]*nums[right];
                left++;
                right--;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
