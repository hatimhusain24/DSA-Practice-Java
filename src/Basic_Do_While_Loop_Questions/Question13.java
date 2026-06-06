package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//keep taking numbers from the user until a negative number is entered, then count how many positive numbers were entered
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        do {
            num = sc.nextInt();
            if (num > 0){
                count++;
            }
        } while (num > 0);
        System.out.println(count);
    }
}
