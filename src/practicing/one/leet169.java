package practicing.one;

public class leet169 {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(func(arr));
    }

    static int func(int[] arr){
        int min=arr.length /2;
        int count=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return 2;
    }
}
