package Basic_For_Loop_Questions;

import java.util.Scanner;

//print the cube of each number from 1 to n
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Cube of "+"i : "+i*i*i);
        }
    }
}
