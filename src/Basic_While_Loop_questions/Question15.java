package Basic_While_Loop_questions;

import java.util.Scanner;

//check whether given number is an armstrong number
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n = n1;
        int sum = 0;
        while (n>0){
            int remainder = n%10;
            sum += (remainder*remainder*remainder);
            n = n/10;
        }
        System.out.println("Armstrong calculation of given number : "+sum);
        if (n1 == sum){
            System.out.println("Given number is an armstrong number");
        }else System.out.println("Given number is not an armstrong number");
    }
}
