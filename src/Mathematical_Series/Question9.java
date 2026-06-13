package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series 1^3+2^3+.....n^3
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.print(sum*sum);
    }
}
