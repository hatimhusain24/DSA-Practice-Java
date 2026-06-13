package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series 1+x+x^2+x^3+......x^n
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n terms : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of x : ");
        int x  = sc.nextInt();
        int product = 1,sum=0;

        for (int i=0; i<=n;i++){
            sum+= product;
            product *= x;
        }
        System.out.print(sum);
    }
}
