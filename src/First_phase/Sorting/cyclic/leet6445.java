package First_phase.Sorting.cyclic;

import java.util.Arrays;

class leet6445 {
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int currentValue=nums[i]-1;
            if(nums[currentValue]!=nums[i]){
                swap(nums,i,currentValue);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length ; j++) {
            if (nums[j]!=j+1){
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {-1,-1};


    }
    static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={2,3,3,4};
        findErrorNums(arr);
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}