package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series 1^2+2^2+.......n^2
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1)*(2*n+1)/6;
        System.out.print(sum);
    }
}
