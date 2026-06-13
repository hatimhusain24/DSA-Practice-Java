package Mathematical_Series;

import java.util.Scanner;

//find and print the sum of the fibonacci series upto the required number of terms
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first=0,second=1,sum=0;

        for (int i=1; i<=n; i++){
            sum += first;
            int next = first+second;
            first=second;
            second=next;
        }
        System.out.println(sum);
    }
}
