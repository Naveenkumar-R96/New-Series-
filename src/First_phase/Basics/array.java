package First_phase.Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        /*int[] value={1,2,3,3};
        System.out.println(value[1]);
        int[] value2=new int[5];
        System.out.println(value2[2]);
        String  summa;
        String[] one={"one","two"};
        System.out.println(one[0]);
        int[] valu=new int[5];
        System.out.println(value);
        for (int i=0; i<valu.length; i++){
            valu[i]=input.nextInt();
        }
        System.out.println(valu[3]);*/

        /// aray of objects;

       /* Scanner input= new Scanner(System.in);

        String[] str=new String[4];
        for (int i=0; i<str.length;i++){
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));

        //modify

        str[1]="kunal";*/

        //multi dimenstionl arary
        int[] val={12,2324};
        System.out.println(Arrays.toString(val));

        int [][] arr=new int[2][2];
        Scanner in=new Scanner(System.in);

        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        //output
       /* System.out.println(Arrays.toString(arr));

        for(int row=0; row<arr.length;row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+"");
            }
            System.out.println();
        }*/

       /* for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
    }
}
