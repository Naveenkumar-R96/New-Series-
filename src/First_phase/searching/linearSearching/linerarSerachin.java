package First_phase.searching.linearSearching;

public class linerarSerachin {
    public static void main(String[] args) {
        int arr[]={1,2,23,4,45,25,454,5654,6743,54,4,3,};
        int target=45;
        System.out.println(linear(arr,target));
    }
    static int linear(int arr[],int target){
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
