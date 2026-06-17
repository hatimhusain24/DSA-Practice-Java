package Nested_Loops_Questions;

import java.util.Scanner;

//print all pythagorean triplets whose values are less than or equal to n
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                for (int k = j+1; k <= n; k++) {
                    if (i*i + j*j == k*k) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
