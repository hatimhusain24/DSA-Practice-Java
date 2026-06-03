package Basic_While_Loop_questions;

import java.util.Scanner;

//find the HCF(Highest Common Factor) of two given numbers
public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Method 1

        int i = 1;
        int hcf = 0;
        int min = Math.min(num1, num2);
        while (i <= min){
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
            i++;
        }
        System.out.println(hcf);

        //Method 2

        while (num2 != 0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        System.out.println(num1);
    }
}
