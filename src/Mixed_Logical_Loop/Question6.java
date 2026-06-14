package Mixed_Logical_Loop;

import java.util.Scanner;

//print a pattern where the ith row prints the value i x i
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i*i);
        }
    }
}
