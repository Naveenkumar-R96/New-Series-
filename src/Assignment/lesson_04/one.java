package Assignment.lesson_04;

import java.util.Scanner;

public class one {
    public static void main(String args[]){
        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value one");
        int first=input.nextInt();
        System.out.println("Enter the value two");
        int second=input.nextInt();
        System.out.println("enter the value three");
        int third =input.nextInt();

        System.out.println("largest is:" + largest(first,second,third));
        System.out.println(" smallest is:" + smallest(first,second,third));
    }

    public static int largest(int one,int two, int three){
        int largests=0;
        if(one>two & one>three){
            largests=one;
        } else if (two>three & two>one) {
            largests=two;
        }
        else{
            largests=three;
        }
        return largests;
    } public static int smallest(int one,int two, int three){
        int largests=0;
        if(one<two & one<three){
            largests=one;
        } else if (two<three & two<one) {
            largests=two;
        }
        else{
            largests=three;
        }
        return largests;
    }
}
