package practicing.one;

public class leet1678 {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(func(command));
    }
    static String func(String command){
        int length=command.length();
        StringBuilder newVal=new StringBuilder();

        for (int i = 0; i <length; i++) {
            if(command.charAt(i)=='G'){
                newVal.append("G");
            }
             else if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                newVal.append("o");
            } else if (command.charAt(i)=='(' && command.charAt(i+1)=='a') {
                newVal.append("al");
            }

        }
        return newVal.toString();
    }
}
