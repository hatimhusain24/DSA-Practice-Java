package Basic_While_Loop_questions;

import java.util.Scanner;

//calculate the sum of all odd numbers from 1 upto n
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while (i<=n){
            if(i%2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
