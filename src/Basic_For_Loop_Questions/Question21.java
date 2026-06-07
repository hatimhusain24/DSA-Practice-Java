package Basic_For_Loop_Questions;

import java.util.Scanner;

//find and print the sum of all odd numbers from 1 up to n
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int oddSum=0;

        for (int i=1; i<=n; i++){
            if (i%2 != 0){
                oddSum += i;
            }
        }
        System.out.println(oddSum);
    }
}
