package Basic_For_Loop_Questions;

import java.util.Scanner;

//find and print the sum of all factors of the given number
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        for (int i=1; i<=num/2; i++){
            if (num%i==0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
