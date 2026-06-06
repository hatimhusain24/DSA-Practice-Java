package Basic_For_Loop_Questions;

//print all prime numbers between 1 and 100
public class Question8 {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i=2; i<=100; i++){
            isPrime=true;
            for (int j=2; j<=i/2; j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
