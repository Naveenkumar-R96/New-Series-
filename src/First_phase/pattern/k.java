package First_phase.pattern;

public class k {
    public static void main(String[] args) {
        int n=10;
        int mid=n/2 ;
        if(mid%2==0){
            mid+=1;
        }
        int mid1=mid;
        System.out.println(mid);

        for (int i = 1; i <=n ; i++) {
            int k=i;
            if(i>mid){

                mid1=mid1-1;
                k=mid1;
            }

            for (int j = 1; j <=k ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
