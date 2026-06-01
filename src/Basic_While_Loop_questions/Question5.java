package Basic_While_Loop_questions;

import java.util.Scanner;

//print the multiplication table of a given number from n*1 to n*10
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(n*i);
            i++;
        }
    }
}
