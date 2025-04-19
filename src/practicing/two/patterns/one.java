package practicing.two.patterns;

import org.w3c.dom.ls.LSOutput;

public class one {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j>=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n*2)-1 ; j++) {
                if (j>n-i && j<n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n*2)-1 ; j++) {
                if (j>=i && j<=((n*2)-1)-i+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j>n-i && j<n+i){
                    if (i%2==0){
                        if (j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if (j%2==1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n*2)-1 ; j++) {
                if (j>=i && j<=(n*2)-1-i+1){
                    if (i%2==0){
                        if (j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if(j%2==1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n*2)-1 ; j++) {
                if (j>=i && j<=(n*2)-1-i+1){
                    if (i%2==0){
                        if (j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if(j%2==1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j>n-i && j<n+i){
                    if (i%2==0){
                        if (j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if (j%2==1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < n * 2 ; j++) {
               if(i==n){
                   System.out.print("*");
               }
               else{
                   if (j == n - i + 1 || j == n + i - 1) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <n*2 ; j++) {
                if(i==1){
                    System.out.print("*");
                }
                else if(j>=i && j<=n*2-1-i+1){

                        if (j==i || j==n*2-1-i+1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
