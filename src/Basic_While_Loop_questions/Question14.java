package Basic_While_Loop_questions;

import java.util.Scanner;

//find and print the sum of digits of given number
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n>0){
            int remainder = n%10;
            sum += remainder;
            n = n/10;
        }
        System.out.println(sum);
    }
}
