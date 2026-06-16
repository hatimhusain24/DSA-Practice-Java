package Star_Pattern_Printing;

import java.util.Scanner;

//print numbers in right triangle form in increasing order and number of elements should be based on row number
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= i; j++) {
                count++;
                System.out.print(count);
                if (j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
