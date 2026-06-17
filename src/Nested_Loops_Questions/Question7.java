package Nested_Loops_Questions;

import java.util.Scanner;

//print a matrix, then calculate and display the sum of each row and the sum of each column
public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            int rowSum=0;
            for (int j = 1; j <= n; j++) {
                System.out.print(count);
                rowSum += count;
                count++;
                if (j!=n){
                    System.out.print(" ");
                }
            }
            System.out.println(" Row Sum "+i+" = "+rowSum);
        }
        for (int i=1; i<=n; i++){
            int num=1;
            int columnSum = 0;
            for (int j=1; j<=n; j++){
                for (int k=1; k<=n; k++) {
                    if(i==k){
                        columnSum+=num;
                    }
                    num++;
                }
            }
            System.out.println("Column Sum "+i+" = "+columnSum);
        }
    }
}
