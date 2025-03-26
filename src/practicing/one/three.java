package practicing.one;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int val=in.nextInt();

        System.out.println(func(val));
    }
    static int func(int val){
        int ans=1;
        while(val>0){
            ans=val*ans;
            val--;
        }
        return ans;
    }
}
