package Mathematical_Series;

import java.util.Scanner;

//print the first n terms of a geometric progression for the given first terms and common ratio
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter the n terms : ");
        int n = sc.nextInt();
        int term = a;

        for (int i=1; i<=n;i++){
            term = term * r;
            System.out.println(term);
        }
    }
}
