package practicing.one;

public class leet438 {
    public static void main(String[] args) {
        /*int[] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int ok=4;
        leet438 obj=new leet438();

        System.out.println(obj.numOfSubarrays(arr,k,ok));
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int avg = threshold;
        int count=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];

        }
        if (sum / avg >= avg) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            if ((int)sum / avg >=avg || (int)sum / avg =avg  ) {
                count++;
            }

        }
        return count;*/
    }
}
