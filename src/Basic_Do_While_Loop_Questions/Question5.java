package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//count and print the number of digits in the given number
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        do {
            num /= 10;
            i++;
        }while (num > 0);

        System.out.println(i);
    }
}
