package Break_Continue_Loops;

import java.util.Scanner;

//take 5 numbers as input, skip any number that is 0 using continue, and calculate the sum of the remaining numbers
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int sum=0;
        while (i<5){
            int n = sc.nextInt();
            i++;
            if (n==0){
                continue;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
