package practicing.one;

public class leet1859 {

        public static  String sortSentence(String s) {
            String[] words = s.split(" ");
            int len = words.length;
            String[] res = new String[len];

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int index = word.charAt(word.length() - 1) - '0';
                res[index - 1] = word.substring(0, word.length() - 1);
            }

            return String.join(" ", res);
        }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    }

