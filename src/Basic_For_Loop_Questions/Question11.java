package Basic_For_Loop_Questions;

import java.util.Scanner;

//find and print the sum of fibonacci series
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacciSum(n);
        System.out.println(result);
    }
    public static int fibonacciSum(int n){
        if (n<=0){
            return -1;
        }
        if (n==1){
            return 0;
        }
        int first = 0;
        int second = 1;
        int sum = first+second;
        for (int i=2; i<n; i++){
            int next = first+second;
            sum += next;
            first=second;
            second=next;
        }
        return sum;
    }
}
