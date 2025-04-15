package practicing.one;

public class leet14 {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder str = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(str.toString())) {
                str.deleteCharAt(str.length() - 1);  // remove last character
                if (str.length() == 0) return "\"\"";
            }
        }

        return str.toString();
    }
}
