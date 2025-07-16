package OOPS.OOPS1;

import org.w3c.dom.ls.LSOutput;

public class main {
    String name;
    int rollNO;
    int marks;

   void disp(String naam,int no, int mak){
       this.name=naam;
       this.rollNO=no;
       this.marks=mak;
       System.out.println(name+" "+ " "+rollNO+" "+marks);

   }
   main(String name,int rollNO){
       this.name=name;
       this.rollNO=rollNO;
       System.out.println(name);
       System.out.println(rollNO);
   }
   static{
       System.out.println("checking");
   }
   static void func(){
       System.out.println("Check");
   }



    public static void main(String[] args) {
        main obj=new main("kl",1);
        obj.disp("naveen",18,99);
        obj.disp("nnn",94,23);
    }
}
