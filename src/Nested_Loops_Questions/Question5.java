package Nested_Loops_Questions;

import java.util.Scanner;

//print the fibonacci pattern row by row, where each row prints the next fibonacci numbers
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0, second=1;

        for (int row=1; row<=n; row++){
            for (int column=1; column<=row; column++){
                System.out.print(first);
                if (column!=row){
                    System.out.print(" ");
                }
                int next = first+second;
                first=second;
                second=next;
            }
            System.out.println();
        }
    }
}
