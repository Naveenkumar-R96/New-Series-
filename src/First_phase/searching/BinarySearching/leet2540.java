package First_phase.searching.BinarySearching;

public class leet2540 {
    public static void main(String[] args) {
       int[] nums1 ={2,3,6};
       int[] nums2={0,1,4,5};

       int ans=getans(nums1,nums2);
        System.out.println(ans);
    }
    static int getans(int[] num1,int[] num2){


        for(int i=0;i<num1.length;i++){
            int start=0;
            int end=num2.length-1;

            int target=num1[i];

            while(start<=end){
                int mid=start+(end-start)/2;

                if(num2[mid]==target){
                    return target;
                }
                else if(num2[mid]>target){
                   end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
