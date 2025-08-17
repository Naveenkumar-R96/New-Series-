package Second_phase;

public class cotenst {
    public static void main(String[] args) {
        int n=99;
        int digit=0;
        int mult=1;
        while(n>0){
             digit+=n%10;
             mult*=n%10;
             n=n/10;

        }
        if(n%digit==0 && n%mult==0){
            System.out.println("yes");
        }
        System.out.println(digit);
        System.out.println(mult);
    }
}
