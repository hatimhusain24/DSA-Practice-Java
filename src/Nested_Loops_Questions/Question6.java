package Nested_Loops_Questions;

import java.util.Scanner;

//generate and print a number triangle pattern using nested loops
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int next = 1;

        for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(next+" ");
                next++;
            }
            System.out.println();
        }
    }
}
