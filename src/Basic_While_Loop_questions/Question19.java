package Basic_While_Loop_questions;

import java.util.Scanner;

//print the fibonacci series upto n terms
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        int i = 2;
        System.out.print(a1 + " " + a2 + " ");
        while (i < n){
            int temp = a1 + a2;
            System.out.print(temp);
            a1 = a2;
            a2 = temp;
            if(i != n-1){
                System.out.print(" ");
            }
            i++;
        }
    }
}
