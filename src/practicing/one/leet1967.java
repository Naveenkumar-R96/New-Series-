package practicing.one;



public class leet1967 {
    public static void main(String[] args) {
        String word="ab";
        String[] patterns={"a","a","a"};

        System.out.println(numOfStrings( patterns,word));
    }

    public static  int numOfStrings(String[] patterns, String word) {
        int res=0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])){
                res++;
            }
        }
        return res;
    }
}
