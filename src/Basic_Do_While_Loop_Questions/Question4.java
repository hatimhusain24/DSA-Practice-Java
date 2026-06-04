package Basic_Do_While_Loop_Questions;

import java.util.Map;
import java.util.Scanner;

//keep taking numbers from the user until 0 is entered, then print the largest number among all inputs
public class Question4 {
    public static void main(String[] args) {
        int max = -1;
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            max = Math.max(max, num);
        }while (num != 0);

        System.out.print(max);
    }
}
