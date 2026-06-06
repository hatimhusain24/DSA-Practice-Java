package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//check whether the given number is a palindrome
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int reversed = 0;
        do {
            int remainder = num1%10;
            reversed = reversed*10 + remainder;
            num1 /= 10;
        }while (num1>0);

        System.out.println(num == reversed);
    }
}
