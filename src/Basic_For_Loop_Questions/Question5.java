package Basic_For_Loop_Questions;

import java.util.Scanner;

//print the multiplication table of a given number
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num +" x "+ i +" = "+ num*i);
        }
    }
}
