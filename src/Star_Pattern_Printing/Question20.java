package Star_Pattern_Printing;

import java.util.Scanner;

//print a triangle pattern of numbers in increasing order and number of elements based on row
public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
                if (j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
