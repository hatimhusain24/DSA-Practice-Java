package Mathematical_Series;

import java.util.Scanner;

//check whether the given number is a strong number, where the number equals the sum of factorials of it's digits
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int sum = 0, factorial;
        int num = original;
        while (num>0){
            int digit = num % 10;
            factorial=1;
            for (int i=digit;i>0;i--){
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        if (original==sum){
            System.out.print("Given number is a strong number");
        } else System.out.print("Given number is not a strong number");
    }
}
