package Star_Pattern_Printing;

import java.util.Scanner;

//print the alphabets in triangle form in increasing order eg. A AB ABC ABCD ABCDE....
public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                if (j!=i){
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
        }
    }
}
