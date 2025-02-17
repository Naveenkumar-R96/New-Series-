package First_phase.Basics;

import java.util.Scanner;

public class Condition_loops {
    public static void main(String[] args) {

/*
        if(salary>10000){
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println(salary);*/

      /*  if(salary > 10000){
            salary+=2000;
        } else if (salary>20000) {
            salary+=3000;
        }
        else{
            salary+=10000;
        }*/

        // Loops

        /*
            fot (initialisation;condition;increment/decrement){
            //body
            }
         */
    /*    for(int num=1;num<=5; num+=1){
            System.out.println(num);
        }

        //print numbers form 1 to n
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        for(int num=0;num<=n;num++){
            System.out.println("Hellow World");
        }*/

        //while loop


        Scanner in =new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        if(a>b & a>c){
            System.out.println("a is the greatest number");
        } else if (b>a & b>c) {
            System.out.println("b is the greatest numbfer");
        }else{
            System.out.println("c is the greatest number");
        }

    }
}
