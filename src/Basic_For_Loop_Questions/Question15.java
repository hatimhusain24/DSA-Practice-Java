package Basic_For_Loop_Questions;

import java.util.Scanner;

//find the LCM(Least Common Multiple) of the given numbers
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int max = Math.max(first,second);

        for (int i=max; ;i++){
            if (i%first==0 && i%second==0){
                System.out.println("LCM for given numbers is : "+i);
                break;
            }
        }
    }
}
