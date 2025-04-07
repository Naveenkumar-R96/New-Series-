package practicing.one;

public class leet1662 {
    public static void main(String[] args) {
        String[] word1={"abc", "d", "defg"};
        String[] word2={"abcddefg"};

        System.out.println(func(word1,word2));
    }
    static boolean func(String[] word1, String[] word2){
        //String let1="";
        //String let2="";
        StringBuilder let1=new StringBuilder();
        StringBuilder let2=new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            let1=let1.append(word1[i]);
        }
        for (int i = 0; i <word2.length ; i++) {
            let2=let2.append(word2[i]);
        }
        System.out.println(let1);
        System.out.println(let2);

        return let1.toString().equals(let2.toString());

    }
}
