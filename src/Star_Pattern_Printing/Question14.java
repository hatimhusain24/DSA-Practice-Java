package Star_Pattern_Printing;

import java.util.Scanner;

//print the right angle triangle of n rows containing number of elements based on row number and once count reach to 9 again start from 0 after 9
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == 9){
                    count=-1;
                }
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
