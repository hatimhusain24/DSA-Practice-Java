package Mixed_Logical_Loop;

import java.util.Scanner;

//find the number between 1 and n that has the maximum digit sum and print that number along with it's digit sum
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxSum=0, maxNumber = 0;

        for (int i = 1; i <= n; i++) {
            int num=i,loopSum=0;
            while (num>0){
                int rem=num%10;
                loopSum+=rem;
                num=num/10;
            }
            if (loopSum>maxSum){
                maxSum=loopSum;
                maxNumber=i;
            }
        }
        System.out.println("The number "+maxNumber+" has the maximum digit same : "+maxSum);
    }
}
