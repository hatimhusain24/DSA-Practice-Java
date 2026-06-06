package Basic_For_Loop_Questions;

import java.util.Scanner;

//calculate and print the factorial of a given number
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;

        for (int i = num; i>0; i--){
            product *= i;
        }

        System.out.println(product);
    }
}
