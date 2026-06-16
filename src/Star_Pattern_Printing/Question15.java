package Star_Pattern_Printing;

import java.util.Scanner;

//print triangle with n rows and each row contains number of element based on row and it will be 1 and 0
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (flag){
                    System.out.print("1");
                    flag = false;
                }else {
                    System.out.print("0");
                    flag = true;
                }
                if (j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
