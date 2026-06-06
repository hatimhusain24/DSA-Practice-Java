package Basic_For_Loop_Questions;

import java.util.Scanner;

//print the fibonacci series upto to the required number of terms
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Please enter the positive number");
            return;
        }
        if (n==1){
            System.out.println(0);
            return;
        }
        int first =0;
        int second =1;
        System.out.print(first +" "+second+" ");
        for (int i=2; i<n; i++){
            int sum = first+second;
            first=second;
            second=sum;
            System.out.print(second+" ");
        }
    }
}
