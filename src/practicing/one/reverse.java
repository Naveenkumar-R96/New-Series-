package practicing.one;

public class reverse {
    public static void main(String[] args) {
        String val="ramukneevan";
        String ans=func(val);
        System.out.println(ans);
    }
    static String func(String word){
        int left=0;
        int right=word.length()-1;
        String ans="";
        for (int i=right ; i>=0; i--) {
            ans=ans+word.charAt(i);
        }
        return ans;
    }
}
