package Nested_Loops_Questions;

import java.util.Scanner;

//print all possible pairs(i,j) where both i and j range from 1 to n
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("("+i+","+j+")");
                if (j!=n){
                    System.out.print(" ");
                }
            }
            if (i!=n){
                System.out.println();
            }
        }
    }
}
