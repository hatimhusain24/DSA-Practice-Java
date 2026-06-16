package Star_Pattern_Printing;

import java.util.Scanner;

//Print the alphabets in triangle pattern and number of elements will be based on row number
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';

        for (int i = 1; i <=n; i++) {
            for(int j=1; j<=i; j++){
                if (c > 'Z'){
                    c = 'A';
                }
                System.out.print(c);
                if (j!=i){
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
        }
    }
}
