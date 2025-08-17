package Second_phase;

public class leet3110 {
    public static void main(String[] args) {
        String s="zaz";
        int sum=0;

        for(int i=0;i<s.length()-1;i++){
            int su=s.charAt(i)-s.charAt(i+1);
            if(su<0){
                System.out.println(su);
                su=-su;
                System.out.println(su);
            }
            sum+=su;
        }
        System.out.println(sum);
    }
}
