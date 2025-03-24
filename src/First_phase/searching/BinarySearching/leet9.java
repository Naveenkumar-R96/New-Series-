package First_phase.searching.BinarySearching;

public class leet9 {
    public static void main(String[] args) {
        int x=12221;
        int length=String.valueOf(x).length();
        boolean ans=check(x,length);
        System.out.println(ans);
    }
    public static boolean check(int val,int st){
        if(val<0){
            return false;
        }
        int or= val;
        int rev=0;

        while(val>0){
            int asd=val%10;
            rev=rev*10+asd;
            val=val/10;
        }
        if(rev==or){
            return true;
        }
        return false;
        }


}
