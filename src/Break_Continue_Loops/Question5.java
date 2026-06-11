package Break_Continue_Loops;

import java.util.Scanner;

//keep taking numbers from the user and print them until a negative number appears, then stop the loop
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int num = sc.nextInt();
            if (num < 0){
                System.out.println("Entered number is negative and hence stopping the loop");
                break;
            }
            System.out.println(num);
        }
    }
}
