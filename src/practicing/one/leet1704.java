package practicing.one;

public class leet1704 {
    public static void main(String[] args) {
        String s="teaoll";
        System.out.println(halvesAreAlike(s));
    }
    static  boolean halvesAreAlike(String s) {
        int mid=s.length()/2;

        s=s.toLowerCase();

        int left=0;
        int right=0;

        for (int i = 0; i <s.length() ; i++) {
            if (i<mid){
                if (s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                    left++;
                }
            } else {
                if (s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                    right++;
                }
            }

        }

        return left==right;
    }
}
