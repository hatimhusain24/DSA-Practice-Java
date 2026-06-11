package Break_Continue_Loops;

import java.util.Scanner;

//continuously add numbers in a loop and stop the loop when the sum becomes greater than 100
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum<=100){
            int num = sc.nextInt();
            sum += num;
            System.out.println(sum);
        }
    }
}
