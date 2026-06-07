package Basic_For_Loop_Questions;

import java.util.Scanner;

//print all numbers between a and b that are divisible by 7
public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=a+1; i<b; i++){
            if (i%7 == 0){
                System.out.println(i);
            }
        }
    }
}
