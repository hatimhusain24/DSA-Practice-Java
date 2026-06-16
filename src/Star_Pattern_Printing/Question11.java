package Star_Pattern_Printing;

import java.util.Scanner;

//print numbers in an increasing sequence (1, 12, 123, 1234....)
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
