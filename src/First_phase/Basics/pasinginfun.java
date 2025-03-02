package First_phase.Basics;

import java.util.Arrays;

public class pasinginfun {
    public static void main(String[] args) {
        int[] nums={3,4,5,23};
        System.out.println(Arrays.toString(nums));

        func(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void func(int[] arr){
        arr[0]=99;
    }
}
