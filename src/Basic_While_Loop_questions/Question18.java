package Basic_While_Loop_questions;

import java.util.Scanner;

//check whether the given number is prime number
public class Question18 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int i =1;
        boolean isPrime = true;
        while (i <= num/2){
            isPrime = true;
            if (num%i == 0){
                isPrime = false;
            }
            i++;
        }
        if (isPrime){
            System.out.println("Given number is prime number");
        }else System.out.println("Given number is not a prime number");
    }
}
