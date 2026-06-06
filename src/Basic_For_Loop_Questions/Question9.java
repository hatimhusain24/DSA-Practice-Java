package Basic_For_Loop_Questions;

import java.util.Scanner;

//check whether the given number is a prime number
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Given number is a prime number");
        }else System.out.println("Given number is not a prime number");
    }
}
