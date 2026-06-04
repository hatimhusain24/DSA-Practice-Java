package Basic_While_Loop_questions;

import java.util.Scanner;

//find the LCM(Least Common Multiple) of two given numbers
public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1, b = num2;

        //Method 1

        int max = Math.max(num1,num2);
        while (true){
            if (max%num1 == 0 && max%num2 == 0){
                break;
            }
            max++;
        }
        System.out.println(max);

        //Method 2

        while (num2 != 0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        int lcm = (a*b)/num1;
        System.out.println(lcm);
    }
}
