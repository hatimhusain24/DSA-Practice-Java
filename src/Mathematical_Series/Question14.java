package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series x - x^2/2! + x^3/3! - x^4/4! +.....
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n terms : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of x : ");
        int x  = sc.nextInt();
        double fact = 1,sum = 0, power = 1;

        for (int i=1; i<=n;i++){
            fact *= i;
            power *= x;
            if (i%2 != 0){
                sum += power/fact;
            }else sum -= power/fact;
        }
        System.out.print(sum);

    }
}
