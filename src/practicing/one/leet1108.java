package practicing.one;

public class leet1108 {
    public static void main(String[] args) {
        String val= ".";
        System.out.println(func(val));
        /*System.out.println(val.length());
        System.out.println(val.insert(0,'9'));
        System.out.println(val.length());*/

    }
    static String func(String value){
        StringBuilder val=new StringBuilder(value);
        for (int i = val.length() - 1; i >= 0; i--) {
            if (val.charAt(i) == '.') {
                val.insert(i + 1, "]"); // insert after the dot
                val.insert(i, "[");     // insert before the dot
            }
        }


        return val.toString();
    }
}
