package Basic_For_Loop_Questions;

import java.util.Scanner;

//find the HCF(Highest Common Factor) of the given numbers
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        //Method 1

        int min = Math.min(first,second);
        int hcf = 1;
        for (int i=min; i>0; i--){
            if (first%i == 0 && second%i == 0){
                hcf = i;
                break;
            }
        }
        System.out.println("HCF for given numbers is : "+hcf);

        //Method 2

        for (int i=2; i<=min; i++){
            if (first%i==0 && second%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF for given numbers is : "+hcf);
    }
}
