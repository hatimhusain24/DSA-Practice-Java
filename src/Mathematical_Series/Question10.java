package Mathematical_Series;

import java.util.Scanner;

//calculate and print the value of the series 1 + 1/2 + 1/3 +.....1/n
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        float sum =0;
        for (int i=1;i<=n;i++){
            sum += (float) 1 / i;
        }
        System.out.print(sum);
    }
}
