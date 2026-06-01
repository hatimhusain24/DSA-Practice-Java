package Basic_While_Loop_questions;

import java.util.Scanner;

//calculate the sum of all even numbers from 1 upto n
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum = 0;
        while (i<=n){
            if (i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
