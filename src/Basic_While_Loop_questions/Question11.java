package Basic_While_Loop_questions;

import java.util.Scanner;

//count and print the total number of digits in a given number
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while (n>0){
            n = n/10;
            i++;
        }
        System.out.println(i);
    }
}
