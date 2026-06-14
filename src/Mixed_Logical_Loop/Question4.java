package Mixed_Logical_Loop;

//print all numbers from 1 to 100 whose sum of digits is a multiple of 3
public class Question4 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            int sum=0, original=i;
            while (original>0){
                int remainder = original%10;
                sum += remainder;
                original /= 10;
            }
            if (sum%3 == 0){
                System.out.println(i);
            }
        }
    }
}
