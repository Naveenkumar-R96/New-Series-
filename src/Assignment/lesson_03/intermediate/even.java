package Assignment.lesson_03.intermediate;

public class even {
    public static void main(String[] args) {
        //Kunal is allowed to go out with his friends only on the even days of a given month.
        int sum=0;
        for(int i=1;i<=31;i++){

            if(i%2==0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
