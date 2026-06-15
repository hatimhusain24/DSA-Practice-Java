package Star_Pattern_Printing;

import java.util.Scanner;

//print a centered pyramid of stars
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k=0;k<n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
