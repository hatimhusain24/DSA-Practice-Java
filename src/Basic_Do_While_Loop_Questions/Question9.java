package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//calculate and print the factorial of the given number
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        do {
            if (num == 0){
                break;
            }
            product *= num;
            num--;
        }while (num>0);

        System.out.println(product);
    }
}
