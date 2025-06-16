package First_phase.searching.BinarySearching;

public class ceil {
    public static void main(String[] args) {
        //ceil is nothing but number greate or = target;
        int[] arr={2,4,6,8,9,11,14,16};
        int start=0;
        int end=arr.length -1;

        int ceil=-1;
        //binary search;

        while(start<=end){
            int target=12;
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
                ceil=arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                System.out.println("9");
            }
        }
        System.out.println(ceil);
    }
}
