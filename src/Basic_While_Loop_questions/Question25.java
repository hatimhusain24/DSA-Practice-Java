package Basic_While_Loop_questions;

import java.util.Scanner;

//find and print the sum of all factors of the given number
public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n){
            if (n%i == 0){
                sum += i;
            }
            i++;
        }
        System.out.print(sum);
    }
}
