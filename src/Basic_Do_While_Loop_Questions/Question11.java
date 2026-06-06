package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//find the HCF(Highest Common Factor) of the given numbers
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        do {
            int remainder = n1%n2;
            n1 = n2;
            n2 = remainder;
        }while (n2 > 0);

        System.out.println(n1);
    }
}
