package Break_Continue_Loops;

import java.util.Scanner;

//skip all odd numbers and print only the even numbers
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range : ");
        int a = sc.nextInt();
        System.out.print("Enter the ending range : ");
        int b = sc.nextInt();

        for (int i=a; i<=b; i++){
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
