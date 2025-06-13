import java.util.ArrayList;

public class leet1920 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int[] nums={5,0,1,2,3,4};
        for (int i = 0; i <nums.length ; i++) {
            int ne=nums[i];
            arr.add(nums[ne]);
        }

    }
}
