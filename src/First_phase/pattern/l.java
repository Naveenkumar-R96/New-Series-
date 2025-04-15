package First_phase.pattern;

public class l {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                int ne=i-1;
                if(j>ne){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
