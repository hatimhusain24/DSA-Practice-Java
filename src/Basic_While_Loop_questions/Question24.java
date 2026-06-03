package Basic_While_Loop_questions;

import java.util.Scanner;

//print all factors of the given number
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while (i<=num){
            if (num%i == 0){
                System.out.print(i);
                if (i != num){
                    System.out.print(" ");
                }
            }
            i++;
        }
    }
}
