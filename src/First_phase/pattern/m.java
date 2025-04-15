package First_phase.pattern;

public class m {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= (n*2)-1; j++) {
                if (j<=n-i){
                    System.out.print(" ");
                } else if (j>=n+i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
