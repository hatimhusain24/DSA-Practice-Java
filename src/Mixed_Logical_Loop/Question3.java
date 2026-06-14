package Mixed_Logical_Loop;

//print all palindrome numbers between 1 and 500
public class Question3 {
    public static void main(String[] args) {
        for (int i=1; i<=500; i++){
            int original = i, reversed = 0;
            while (original>0){
                int remainder = original%10;
                reversed = reversed*10 + remainder;
                original /= 10;
            }
            if (i == reversed){
                System.out.println(i);
            }
        }
    }
}
