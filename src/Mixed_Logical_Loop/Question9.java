package Mixed_Logical_Loop;

//print all perfect numbers between 1 and 1000
public class Question9 {
    public static void main(String[] args) {
        for (int i=1; i<=1000; i++){
            int sum=0;
            for (int j=1; j<=i/2; j++){
                if (i%j==0){
                    sum+= j;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}
