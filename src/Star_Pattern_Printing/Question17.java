package Star_Pattern_Printing;

import java.util.Scanner;

//print the triangle pattern of repeated alphabets in each row based on count...eg. A BB CCC.....
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                if (j!=i){
                    System.out.print(" ");
                }
            }
            c++;
            System.out.println();
        }
    }
}
