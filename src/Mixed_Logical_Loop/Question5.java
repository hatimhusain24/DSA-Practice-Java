package Mixed_Logical_Loop;

import java.util.Scanner;

//print all numbers from 1 to n whose binary representation contains an even number of 1s
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int number = i, count = 0;
            while (number>0){
                int remainder = number % 2;
                count+=remainder;
                number /= 2;
            }
            if (count%2 == 0){
                System.out.println(i);
            }
        }
    }
}
