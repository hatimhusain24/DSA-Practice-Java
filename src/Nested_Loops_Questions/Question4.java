package Nested_Loops_Questions;

import java.util.Scanner;

//print all prime numbers up to n using nested loop checking
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=2; i<=n; i++){
            boolean isPrime = true;
            for (int j=2; j<=i/2; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i+" ");
        }
    }
}
