package Basic_For_Loop_Questions;

import java.util.Scanner;

//find and print the sum of the first n natural numbers
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
