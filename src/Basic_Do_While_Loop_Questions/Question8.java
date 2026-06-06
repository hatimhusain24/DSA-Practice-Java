package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//check whether the given number is an armstrong number
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int num1 = num;
        do {
            int remainder = num1%10;
            sum += (remainder*remainder*remainder);
            num1 /= 10;
        }while (num1>0);

        System.out.println(num == sum);
    }
}
