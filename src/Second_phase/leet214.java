package Second_phase;

public class leet214 {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences)
        );
    }

    public static int mostWordsFound(String[] sentences) {
        int maxi = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split("\\s+");
            maxi = Math.max(maxi, words.length);

        }
        return maxi;
    }
}
