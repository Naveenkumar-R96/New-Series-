package practicing.one;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        //program to find the fibonacci series for a given number
        Scanner in=new Scanner(System.in);

        int value= in.nextInt();

        fibon(value);
    }
    static void fibon(int val){

        int first=0;
        int second=1;

        for (int i = 0; i < val; i++) {
            System.out.println(first);
            int third=first+second;
            first=second;

            second=third;

        }
    }
}
