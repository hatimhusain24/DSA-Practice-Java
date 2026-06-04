package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//reverse the given number and print the reversed value
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;
        do {
            int remainder = num%10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }while (num > 0);

        System.out.println(reversed);
    }
}
