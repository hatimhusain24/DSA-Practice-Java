package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series 1!+2!+3!+.........n!
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1,sum=0;
        for (int i=2; i<=n;i++){
            factorial *= i;
            sum += factorial;
        }
        System.out.print(sum);
    }
}
