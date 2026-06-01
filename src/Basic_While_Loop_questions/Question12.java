package Basic_While_Loop_questions;

import java.util.Scanner;

//Reverse the given number and print the reverse value
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseNumber = 0;
        while (n>0){
            int remainder = n%10;
            reverseNumber = reverseNumber*10 + remainder;
            n = n/10;
        }
        System.out.println(reverseNumber);
    }
}
