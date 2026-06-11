package Break_Continue_Loops;

import java.util.Scanner;

//search for a specific number in a list of inputs and terminate the loop immediately when the number is found
public class Question4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter target :");
        int target = sc.nextInt();
        for (int i=1; i<=n; i++){
            int num = sc.nextInt();
            if (num==target){
                System.out.println("Target number found");
                break;
            }
        }
    }
}
