package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//calculate and print the sum of even digits and the sum of odd digits of the given number separately
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        do {
            int remainder = num%10;
            if (remainder%2 == 0){
                evenSum += remainder;
            }else oddSum += remainder;
            num /= 10;
        }while (num > 0);

        System.out.println("Sum of Even Digits : "+evenSum);
        System.out.println("Sum of Odd Digits : "+oddSum);
    }
}
