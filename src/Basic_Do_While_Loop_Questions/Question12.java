package Basic_Do_While_Loop_Questions;

import java.util.Scanner;

//create a menu-driven program that allows the user to choose and perform different operations
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Division\n5. Exit\n");
            System.out.print("Enter your choice : ");
            n = sc.nextByte();
            if (n == 5){
                System.out.println("Exiting...");
                break;
            }
            if (n < 1 || n > 5){
                System.out.println("Invalid choice. Please select appropriately from menu displayed");
                continue;
            }
            System.out.print("Enter first number : ");
            int n1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int n2 = sc.nextInt();

            switch (n){
                case 1 -> System.out.println("Result of Addition : "+(n1+n2));
                case 2 -> System.out.println("Result of Subtraction : "+(n1-n2));
                case 3 -> System.out.println("Result of Multiplication : "+(n1*n2));
                case 4 -> System.out.println("Result of Division : "+(n1/n2));
            }
        } while (true);
    }
}
