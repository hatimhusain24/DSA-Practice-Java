package Basic_While_Loop_questions;

//print all prime numbers between 1 and 100
public class Question17 {
    public static void main(String[] args) {
        int num=2;
        while (num<=100){
            int i=2;
            boolean isPrime = true;
            while (i*i <= num){
//            while (i <=num/2){ -- this also can be the while condition scenario
                if(num%i==0){
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime){
                System.out.println(num);
            }
            num++;
        }
    }
}
