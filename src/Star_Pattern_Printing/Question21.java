package Star_Pattern_Printing;

import java.util.Scanner;

//print the triangle 1 121 12321.... in pyramid pattern
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();

        for (int i = 1; i <= n; i++) {
            //prefix spaces
            for (int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            //increasing numbers
            for (int j =1; j<=i; j++) {
                System.out.print(j);
            }
            //decreasing numbers
            for (int l = i-1; l>0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
