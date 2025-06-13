package practicing.one;

public class gfg2 {
    public static void main(String[] args) {
        int n=27;
        int ans=1;
        while(n>0){
            ans=n*ans;
            n--;
        }
        String fina=String.valueOf(ans);
        System.out.println(fina.length());
    }
}
