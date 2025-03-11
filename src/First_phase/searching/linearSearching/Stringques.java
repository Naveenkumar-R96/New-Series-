package First_phase.searching.linearSearching;

public class Stringques {
    public static void main(String[] args) {
     String val="naveenkumar";
     char lett='u';
        System.out.println(func(val,lett));
    }
    static int func(String val,char letter){
        if(val.length()==0){
            return -1;
        }
        for(int i=0;i<val.length();i++){
            int ele=val.charAt(i);
            if(ele==letter){
                return i;
            }
        }
        return -1;
    }

}
