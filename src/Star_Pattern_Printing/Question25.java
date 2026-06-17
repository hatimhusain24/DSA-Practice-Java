package Star_Pattern_Printing;

import java.util.Scanner;

//print the pyramid pattern with number of elements based on row count but element starts from n eg. 5 545 54345 5432345
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            //blank spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //decreasing order
            for (int k = n; k > n-i; k--) {
                System.out.print(k);
            }
            //increasing order
            for (int l=n-i+2; l <=n; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
