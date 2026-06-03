package Basic_While_Loop_questions;

import java.util.Scanner;

//print the cube of each number from 1 to n
public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            System.out.println(i*i*i);
            i++;
        }
    }
}
