package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//keep taking the numbers from the user until 0 is entered, then print the sum of all entered numbers
public class Question3 {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            sum += num;
        }while (num != 0);
        System.out.println(sum);
    }
}

