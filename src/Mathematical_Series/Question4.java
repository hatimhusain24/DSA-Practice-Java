package Mathematical_Series;

import java.util.Scanner;

//print the first n terms of an arithmetic progression for the given first term and common difference
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference : ");
        int d = sc.nextInt();
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int an = a + (i-1)*d;
            System.out.println(an);
        }
    }
}
