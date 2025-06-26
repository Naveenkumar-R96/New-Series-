package OOPS;

public class father {
    int a=5;
    int b=6;
    int c=a;
    void func(int a,int b,int s){
        System.out.println("in father class");

        this.a=a;
        this.b=b;

        System.out.println(a+""+b +""+c);
    }
    void print(){
      //  System.out.println("in the father calass");
        //System.out.println("check");
        System.out.println(a+""+b+""+""+c);

    }
}
