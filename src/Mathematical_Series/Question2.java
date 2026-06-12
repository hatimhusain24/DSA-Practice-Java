package Mathematical_Series;

import java.util.Scanner;

//find and print the sum of first n even numbers
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1);
        System.out.print(sum);

    }
}
