package Basic_For_Loop_Questions;

import java.util.Scanner;

//print all factors of the given number
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorNumber(num);
    }
    public static void factorNumber(int num){
        for (int i=1; i<=num/2; i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
}
