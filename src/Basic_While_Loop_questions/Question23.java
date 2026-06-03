package Basic_While_Loop_questions;

import java.util.Scanner;

//print all numbers between a and b that are divisible by 7
public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a < b){
            a++;
            if (a%7 == 0){
                System.out.print(a + " ");
            }
        }
    }
}
