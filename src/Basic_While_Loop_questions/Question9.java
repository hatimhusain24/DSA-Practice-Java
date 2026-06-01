package Basic_While_Loop_questions;

import java.util.Scanner;

//calculate and print the factorial of a given number
public class Question9 {
    public static void main(String[] args) {
        // 5! = 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while (n>0){
            product *= n;
            n--;
        }
        System.out.println(product);
    }
}
