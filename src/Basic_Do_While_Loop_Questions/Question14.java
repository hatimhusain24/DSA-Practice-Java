package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//find and print the sum of digits of the given number
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do {
            int remainder = num%10;
            sum += remainder;
            num /= 10;
        }while (num > 0);

        System.out.println(sum);
    }
}
