package Basic_While_Loop_questions;

import java.util.Scanner;

//find and print the product of all digits of a given number
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remainder = 1;
        while (n>0){
            remainder *= n%10;
            n = n/10;
        }
        System.out.println(remainder);
    }
}
