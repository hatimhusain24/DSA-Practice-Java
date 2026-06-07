package Basic_For_Loop_Questions;

import java.util.Scanner;

//find and print the sum of all even numbers from 1 up to n
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Method 1

        int evenSum = 0;
        for (int i=1; i<=n; i++){
            if (i%2==0){
                evenSum += i;
            }
        }
        System.out.println(evenSum);

        //Method 2

        int evenSum1 = 0;
        for (int i=2; i<=n; i=i+2){
            evenSum1 += i;
        }
        System.out.println(evenSum1);
    }
}
