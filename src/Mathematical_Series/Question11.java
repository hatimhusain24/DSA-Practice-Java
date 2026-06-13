package Mathematical_Series;

import java.util.Scanner;

//print the series of power of two 1+2+4+8......+2^n
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //maths formula for this series 2^(n+1)-1 but will go for loop
        int sum =0, term=1;

        for (int i=1;i<=n;i++){
            sum += term;
            term *= 2;
        }
        System.out.print(sum);

    }
}
