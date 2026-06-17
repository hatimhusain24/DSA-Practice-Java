package Star_Pattern_Printing;

import java.util.Scanner;

//print the diamond pattern of stars
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i>0; i--) {
            for (int k=n; k>i; k--) {
                System.out.print(" ");
            }
            for (int j=(i*2)-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
