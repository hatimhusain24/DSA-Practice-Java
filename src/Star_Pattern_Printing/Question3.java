package Star_Pattern_Printing;

import java.util.Scanner;

//print n stars on same line
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }
}
