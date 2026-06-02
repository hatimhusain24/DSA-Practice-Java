package Basic_While_Loop_questions;

import java.util.Scanner;

//check whether the given number is perfect number
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<n){
            if(n%i == 0){
                sum += i;
            }
            i++;
        }
        if (sum == n){
            System.out.println("Given number is perfect number");
        }else System.out.println("Given number is not perfecet number");
    }
}
