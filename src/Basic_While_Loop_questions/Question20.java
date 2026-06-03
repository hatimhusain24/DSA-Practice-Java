package Basic_While_Loop_questions;

import java.util.Scanner;

//find and print the sum of the fibonacci series upto n terms
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        int sum = a1+a2;
        int i = 2;
        while (i< n){
            int temp = a1+a2;
            a1 = a2;
            a2 = temp;
            sum += temp;
            i++;
        }
        System.out.println(sum);
    }
}
