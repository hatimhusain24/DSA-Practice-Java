package Mathematical_Series;

import java.util.Scanner;

//print the fibonacci series upto the required number of terms
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        for (int i=1; i<=n;i++){
            System.out.print(first+" ");
            int next = first+second;
            first=second;
            second=next;
        }
    }
}
