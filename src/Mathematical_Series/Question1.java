package Mathematical_Series;

import java.util.Scanner;

//find and print the sum of the first n natural numbers
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.print(sum);
    }
}
