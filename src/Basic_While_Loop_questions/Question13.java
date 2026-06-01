package Basic_While_Loop_questions;

import java.util.Scanner;

//check whether the given number is a palindrome
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int n1=n;
        while (n1>0){
            int remainder = n1%10;
            reverse = reverse*10 + remainder;
            n1 = n1/10;
        }
        if (n == reverse){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not a palindrome");
        }
    }
}
