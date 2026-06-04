package Basic_While_Loop_questions;

import java.util.Scanner;

//find the largest digit in the given number
public class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int biggestNumber = -1;
        while (num > 0){
            int remainder = num%10;
            biggestNumber = Math.max(biggestNumber, remainder);
            num /= 10;
        }
        System.out.println(biggestNumber);
    }
}
