package Star_Pattern_Printing;

import java.util.Scanner;

//print a right aligned triangle of stars
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j=0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k=n-i; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
