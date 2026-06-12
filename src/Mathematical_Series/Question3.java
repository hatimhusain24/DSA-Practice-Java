package Mathematical_Series;

import java.util.Scanner;

//find and print the sum of the first n odd numbers
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*n;
        System.out.print(sum);
    }
}
