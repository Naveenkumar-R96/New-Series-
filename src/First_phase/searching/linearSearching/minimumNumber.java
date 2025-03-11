package First_phase.searching.linearSearching;

public class minimumNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,-23,8,9};
        System.out.println(func(arr));
    }
    static int func(int[] arr){
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<first){
                first=arr[i];
            }
        }
        return first;
    }
}
