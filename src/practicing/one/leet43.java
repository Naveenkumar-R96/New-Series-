package practicing.one;

public class leet43 {
    public static void main(String[] args) {
        String num1="123456789";
        String num2="987654321";
        System.out.println(func(num1,num2));
    }
    static String func (String one, String two){
        int onnne= Integer.parseInt(one);
        int twwoo= Integer.parseInt(two);
        System.out.println(onnne);

        long ans=onnne*twwoo;
        String fin= String.valueOf(ans);

        return fin;

    }
}
