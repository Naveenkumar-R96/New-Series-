package practicing.one;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int value=in.nextInt();

        boolean ans=func(value);
        if(ans==true){
            System.out.println("is a perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }
    }
   static boolean func(int value){
            int ans=0;
        for (int i = 1; i < value; i++) {
            if(value%i==0){
                ans+=i;
            }

        }
        if(ans==value){
            return true;
        }
        return false;
    }
}
