package First_phase.searching.BinarySearching;

public class code {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int targ=9;
        int ans=binaryy(arr,targ);
        System.out.println(ans);
    }
    static int binaryy(int[] arr,int target){
        int start=0;
        int end=arr.length -1;

        while(start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target>mid){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
}
