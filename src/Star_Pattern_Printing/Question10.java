package Star_Pattern_Printing;

import java.util.Scanner;

//print stars and spaces alternating (Stars and Blank spaces) (b=blank space here)
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
                if (k!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
