package Basic_While_Loop_questions;

import java.util.Scanner;

//find the smallest digit in the given number
public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int smallestDigit = Integer.MAX_VALUE;
        while (num >0){
            int remainder = num%10;
            smallestDigit = Math.min(smallestDigit, remainder);
            num = num/10;
        }
        System.out.println(smallestDigit);
    }
}
