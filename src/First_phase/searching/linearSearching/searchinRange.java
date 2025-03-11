package First_phase.searching.linearSearching;

public class searchinRange {
    public static void main(String[] args) {
        int arr[]={1,2,23,4,45,25,454,5654,6743,54,4,3,};
        int target=45;
        int start=3;
        int end=8;
        System.out.println(linear(arr,target,start,end));
    }
    static int linear(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
