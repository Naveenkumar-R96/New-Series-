package practicing.two.patterns;

import java.util.Arrays;

public class leet238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ans=1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    continue;
                }
                ans=ans*nums[j];
            }
            arr[i]=ans;
        }
        return arr;
    }
}
