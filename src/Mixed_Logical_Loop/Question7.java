package Mixed_Logical_Loop;

import java.util.Scanner;

//find and print the sum of odd digits & the sum of even digits of the given number
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum=0, oddSum=0;

        while (num>0){
            int remainder = num%10;
            if (remainder%2 == 0){
                evenSum += remainder;
            }else oddSum += remainder;
            num /= 10;
        }
        System.out.println("Sum of even digits : "+evenSum);
        System.out.print("Sum of odd digits : "+oddSum);
    }
}
