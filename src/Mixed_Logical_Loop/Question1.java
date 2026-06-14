package Mixed_Logical_Loop;

//print all numbers between 1 and 100 whose sum of digits is even
public class Question1 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            int sum=0;
            int num=i;
            while (num>0){
                int remainder = num%10;
                sum+= remainder;
                num /= 10;
            }
            if (sum%2 == 0){
                System.out.println(i);
            }
        }
    }
}
