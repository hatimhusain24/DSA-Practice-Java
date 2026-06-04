package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//print the multiplication table of a given number
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }while (i<=10);
    }
}
