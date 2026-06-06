package Basic_For_Loop_Questions;

import java.util.Scanner;

//calculate and print the factorial of every number from 1 to n
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double product;
        for (int i=1; i<=n; i++){
            product = 1;
            for (int j=i; j>0; j--){
                product *= j;
            }
            System.out.println("Factorial of "+i+" : "+product);
        }
    }
}