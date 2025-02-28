package Assignment.lesson_03.intermediate;

public class stringreverse {
    public static void main(String[] args) {
        //program to reverse the string
        String value="naveenkumar";
        System.out.println(value.length());
        String reversed ="";
        for(int i=10;i>=0; i--){
            reversed+=value.charAt(i);
        }
        System.out.println(reversed);
    }
}
