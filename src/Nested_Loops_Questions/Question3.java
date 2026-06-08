package Nested_Loops_Questions;

import java.util.Scanner;

//for every number from 1 to n, count and print the total number of it's factors
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print("Factors of "+ i + " : ");
            for (int j=1; j<=i; j++){
                if (i%j == 0){
                    System.out.print(j);
                    if (j!=n){
                        System.out.print(" ");
                    }
                }
            }
            if (i!=n) System.out.println();
        }
    }
}
