/*
package First_phase.searching.BinarySearching;

public class leet852 {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end=arr.length-1;

        while(start<end){
            int mid=start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //this may be the answer but look at the left also
                end=mid;
            }
            else{
                start=mid+1;
            }
            return start;
        }
    }
}
*/
