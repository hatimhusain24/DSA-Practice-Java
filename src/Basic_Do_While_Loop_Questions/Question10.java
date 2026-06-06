package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//print the fibonnaci series upto the required number of terms
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int sum;
        int i = 2;
        do {
            if (n < 3){
                System.out.print("Please provide number of terms more than 2");
                break;
            }
            if (i == 2){
                System.out.print(first+" "+second+" ");
            }
            sum = first+second;
            first = second;
            second = sum;
            System.out.print(second);
            if (i != n-1){
                System.out.print(" ");
            }
            i++;
        }while (i<n);
    }
}
